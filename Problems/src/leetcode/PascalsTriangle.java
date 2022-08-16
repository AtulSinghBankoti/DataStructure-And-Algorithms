package leetcode;
import java.util.*;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> res = new ArrayList<>();
    	
    	for(int i=0; i<numRows; i++) {
    		List<Integer> list = new ArrayList<>(); 
    		if(i==0) {
    			list.add(1);
    		}else {
    			for(int j=0; j<=i; j++) {
    				int sum=0;
    				if(res.get(i-1) != null && res.get(i-1).size() > j-1 &&  j-1 >=0 ) {
    					sum += res.get(i-1).get(j-1);
    				}
    				
    				if(res.get(i-1) != null && res.get(i-1).size()> j & j>=0) {
    					sum += res.get(i-1).get(j);
    				}
    				
    				list.add(sum);
    			}
    		}
    		res.add(list);
    	}
    	return res;
    }
	
	public static void main(String[] args) {
		
		List<List<Integer>> res = new PascalsTriangle().generate(1);
		/*
		for(List<Integer> list: res) {
			System.out.println(">>>"+list);
		}*/
		new PascalsTriangle().generate(5).stream().forEach(System.out::print);

	}

}
