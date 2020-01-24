package dsAlgo;

import java.util.Arrays;

public class LCSDynamicProgrammic {

	 static int mat[][]=new int[8][7];
	
	 int memoized_lCS(String s1,int i,String s2,int j){
		if(i<0 || j<0){
			return 0;
		}else if(s1.charAt(i)==s2.charAt(j)){
			return mat[i+1][j+1]=1+memoized_lCS(s1, i-1, s2, j-1);
		}else{
			return Integer.max(memoized_lCS(s1,i-1,s2,j),memoized_lCS(s1,i,s2,j-1));
		}
	}
	
	int [][] tabulation_lCS(String str1,String str2){
		int arr[][]=new int[str1.length()+1][str2.length()+1];
		/*for(int i=1;i<arr.length;i++)
			arr[i][0]=0;
		  for(int i=1;i<arr[0].length;i++)
			arr[0][i]=0;*/
		
		for(int i=1;i<arr.length;i++)
			for(int j=1;j<arr[0].length;j++)
				if( str1.charAt(i-1)==str2.charAt(j-1)){
					arr[i][j]=1+arr[i-1][j-1];
				}else
					arr[i][j]=Integer.max(arr[i-1][j], arr[i][j-1]);
		return arr;
	}
	 
	public static void main(String[] args) {

		String str1="ABCBDAB";
		String str2="BDCABA";		
		System.out.println(new LCSDynamicProgrammic().memoized_lCS(str1, str1.length()-1, str2, str2.length()-1));
		System.out.println("::>>>");
		for(int ar[]:mat)
			System.out.println(Arrays.toString(ar));
		System.out.println(":::::::::::::::::::::::::");
		int arr[][]=new LCSDynamicProgrammic().tabulation_lCS(str1, str2);
		System.out.println("::>>>");
		for(int ar[]:arr)
			System.out.println(Arrays.toString(ar));
		System.out.println(":::::::::::::::::::::::::");
	}

}
