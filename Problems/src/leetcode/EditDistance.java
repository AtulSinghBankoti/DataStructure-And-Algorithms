package leetcode;

public class EditDistance {
	
	
	public int minDistance(String word1, String word2) {
		
		int [][] dp = new int[word1.length()][word2.length()];
		for(int i=0; i<word1.length(); i++) {
			for(int j=0; j<word2.length(); j++) {
				dp[i][j] = -1;
			}
		}
	
		return getMin(word1,word2,word1.length()-1,word2.length()-1,dp);
		
	}

	private int getMin(String word1, String word2, int p1, int p2,int [][] dp ) {
		
		if(p1<0) {
			return p2+1;
		}
			
		if(p2<0) {	
			return p1+1;
		}
		
		if(dp[p1][p2] != -1) {
			return dp[p1][p2];
		}
	
		if(word1.charAt(p1) == word2.charAt(p2)) {
			return dp[p1][p2] = 0+getMin(word1, word2, p1-1, p2-1,dp);
		}
		
		return dp[p1][p2]=1+Integer.min(getMin(word1, word2, p1-1, p2-1,dp),Integer.min(getMin(word1, word2, p1-1, p2,dp),
				getMin(word1, word2, p1, p2-1,dp)));
		
		
	
	}

	public static void main(String[] args) {
		
			String word1 = "horse";
			String word2 = "ros";
			
			
			
			System.out.println(new EditDistance().minDistance(word1, word2));
	}

}
