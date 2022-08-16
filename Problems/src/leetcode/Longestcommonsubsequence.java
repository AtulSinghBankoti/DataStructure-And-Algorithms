package leetcode;

public class Longestcommonsubsequence {

	 public int longestCommonSubsequence(String text1, String text2) {
		 
		 	int [][] dp = new int[text1.length()][text2.length()];
	        return findseq(text1, text2,0,0, dp);
	    }
	    
	    int findseq(String text1, String text2, int p1 ,int p2 , int [][]dp){
	        
	        if(p1 > text1.length()-1 || p2 > text2.length()-1){
	            return 0;
	        }
	        
	        if(dp[p1][p2] !=0 ) {
	        	return dp[p1][p2];
	        }else if(text1.charAt(p1) == text2.charAt(p2)){
	            return dp[p1][p2]= 1+findseq(text1, text2, p1+1, p2+1, dp);
	        }else{
	            return dp[p1][p2]=Integer.max(findseq(text1, text2, p1+1, p2,dp), findseq(text1, text2, p1, p2+1,dp));
	        }
	        
	        
	    }
	
	public static void main(String[] args) {
		
		System.out.println(new Longestcommonsubsequence().longestCommonSubsequence("pmjghexybyrgzczy", "hafcdqbgncrcbihkd"));
		

	}

}
