package gfg;

import java.util.HashMap;

public class HitMostBalloons {

	public int mostBalloons(int N, int arr[][]) {
        
		if(N<1) {
			return 0;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			if(map.containsKey(arr[i][1])) {
				map.put(arr[i][1], map.get(arr[i][1])+1);
			}else {
				map.put(arr[i][1], 1);
			}
		}
		
		int max= 0;
		for(java.util.Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue(); 
			}
		}
	
		return max;
    }
	
	public static void main(String[] args) {

		
		

	}

}
