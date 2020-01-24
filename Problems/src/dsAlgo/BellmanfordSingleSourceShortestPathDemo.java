package dsAlgo;

/*
 * Time: O(v*3)
 * 
 * 
 */


import java.util.Arrays;

public class BellmanfordSingleSourceShortestPathDemo {

	
	
	int [] relaxEdges(int [][] input){
		
		int []distanceVertex = new int[input.length];
		
		for(int i=1; i<distanceVertex.length; i++) {
			distanceVertex[i] = Integer.MAX_VALUE;
		}

		for(int i=0; i<distanceVertex.length-1; i++) {
			for(int j=0; j<input.length; j++) {
				for(int k=0; k<input.length; k++) {
					
					if((distanceVertex[j]+input[j][k]) < distanceVertex[k] ) {
						distanceVertex[k] = distanceVertex[j]+input[j][k];
					}
				}
			}
		}

	return distanceVertex;
	}
	
	
	public static void main(String[] args) {

		int [][] input = { {0, 6, 7, 10000, 10000},
						   {10000, 0, 8, 5, -4},
						   {10000, 10000, 0, -3, 9},	
						   {10000, -2, 10000, 0, 10000},	
						   {10000, 10000, 10000, 7, 0} };

		BellmanfordSingleSourceShortestPathDemo shortestPathDemo = new BellmanfordSingleSourceShortestPathDemo();
		int[] output= shortestPathDemo.relaxEdges(input);
		
		System.out.println(Arrays.toString(output));

	}

}
