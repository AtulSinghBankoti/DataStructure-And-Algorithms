package dsAlgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlgoSelection3 {

	
	  static long dp[][][];
	    public static long calc(int profits[][], int n) {
	        if(n==1){
	            long ans = 0;
	            for(int i: profits[0]) ans = Math.max(ans, i);
	            return ans;
	        }
	        long ans = 0;
	        dp = new long[n][4][4];
	        for(int i=0;i<n;i++) 
	        	for(int j=0;j<4;j++) 
	        		Arrays.fill(dp[i][j], -1);
	        
	        for(int i=0;i<4;i++){
	            for(int j=0;j<4;j++){
	                if(i==j) continue;
	                ans = Math.max(ans, profits[0][i] + profits[1][j] + fun(2, n, i, j, profits));
	            }
	        }
	        return ans;
	    }
	    
	    static long fun(int i, int n, int prev2, int prev1, int profits[][]){
	        if(i>=n) return 0;
	        if(dp[i][prev1][prev2]!=-1) return dp[i][prev1][prev2];
	        long ans = 0;
	        for(int j=0;j<4;j++){
	            if(j==prev1 || j==prev2) continue;
	            ans = Math.max(ans, profits[i][j] + fun(i+1, n, prev1, j, profits));
	        }
	        return dp[i][prev1][prev2] = ans;
	    }

	    public static int solve(List<List<Integer>> prts) {
	        int arr2[][]=new int[prts.size()][4];
	        for(int j=0;j<prts.size();j++) {
	            List<Integer> li=prts.get(j);
	            arr2[j][0]=li.get(0);
	            arr2[j][1]=li.get(1);
	            arr2[j][2]=li.get(2);
	            arr2[j][3]=li.get(3);
	        }
	        return  (int)calc(arr2,prts.size());

	    }
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, q).forEach(qItr -> {
	            try {
	                int w = Integer.parseInt(bufferedReader.readLine().trim());

	                List<List<Integer>> profits = new ArrayList<>();

	                IntStream.range(0, w).forEach(i -> {
	                    try {
	                        profits.add(
	                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                                .map(Integer::parseInt)
	                                .collect(Collectors.toList())
	                        );
	                    } catch (IOException ex) {
	                        throw new RuntimeException(ex);
	                    }
	                });

	                int result = solve(profits);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();*/
		
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(20);l1.add(30);l1.add(40);
		List<Integer> l2=new ArrayList<>();
		l2.add(60);l2.add(70);l2.add(80);l2.add(110);
		lists.add(l1);
		lists.add(l2);

		/*List<Integer> l1=new ArrayList<>();
		l1.add(85811288);l1.add(93980811);l1.add(51803620);l1.add(17146039);
		
		List<Integer> l2=new ArrayList<>();
		l2.add(28837885);l2.add(11306308);l2.add(59840597);l2.add(11545561);
		
		List<Integer> l3=new ArrayList<>();
		l3.add(62183364);l3.add(56915416);l3.add(56946063);l3.add(63633348);
		   
		List<Integer> l4=new ArrayList<>();
		l4.add(24780786);l4.add(88615050);l4.add(35070424);l4.add(48173555);   
		
		List<Integer> l5=new ArrayList<>();
		l5.add(15881301);l5.add(26918390);l5.add(55587126);l5.add(95304948);   
		
		List<Integer> l6=new ArrayList<>();
		l6.add(60438952);l6.add(34190522);l6.add(90670748);l6.add(25448358);   
		 
		List<Integer> l7=new ArrayList<>();
		l7.add(79476263);l7.add(19213096);l7.add(68142312);l7.add(77223043);
		
		List<Integer> l8=new ArrayList<>();
		l8.add(12447046);l8.add(84566941);l8.add(92175339);l8.add(55213086);
		   
		List<Integer> l9=new ArrayList<>();
		l9.add(58287031);l9.add(53771875);l9.add(42755605);l9.add(38801270);
		   
		
		lists.add(l1);lists.add(l2);lists.add(l3);lists.add(l4);
		lists.add(l5);lists.add(l6);lists.add(l7);lists.add(l8);lists.add(l9);
		*/
		int arr[]=new int [lists.size()];
		Arrays.fill(arr, -1);
		System.out.println(solve(lists));		
		
	}

}
