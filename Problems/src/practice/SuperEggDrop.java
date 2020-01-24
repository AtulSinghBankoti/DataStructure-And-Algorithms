package practice;

/**
 * 
 * link: https://leetcode.com/problems/super-egg-drop/
 * 
 */
public class SuperEggDrop {
	
	
	public int superEggDrop(int K, int N) {

		if(N == 1 || N == 0) {
			return N;
		}

		if(K == 1) {
			return N;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int f=1; f<=N; f++) {
			int res = Integer.max(superEggDrop(K-1, N-1),
			superEggDrop(K, N-f));
			
			if(res < min){
				min = res;
			}
		}
		
		return min+1;
	}

	public static void main(String[] args) {
		
		SuperEggDrop superEggDrop = new SuperEggDrop();
		
		int res = superEggDrop.superEggDrop(2, 10);
		System.out.println("Answer:"+res);

	}

}
