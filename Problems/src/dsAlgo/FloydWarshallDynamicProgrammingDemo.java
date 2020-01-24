package dsAlgo;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class FloydWarshallDynamicProgrammingDemo {

	void allPairShortestPath(int [][]input){
		
		for(int k=0; k<input.length; k++) {
			
			for(int i=0; i<input.length; i++) {
				
				for(int j=0; j<input.length; j++) {
					
					input[i][j] = Integer.min(input[i][j], input[i][k]+input[k][j]);
				}
			}
		}
	}
	
	public static void main(String args[]){
		int [][] input = {{0,11,1,6},
				  		  {11,0,7,3},
				  		  {1,7,0,2},
				  		  {6,3,2,0},
				  		};
		
		FloydWarshallDynamicProgrammingDemo warshallDynamicProgrammingDemo =new FloydWarshallDynamicProgrammingDemo();
		warshallDynamicProgrammingDemo.allPairShortestPath(input);
		
		for(int i=0; i<input.length; i++) {
			System.out.println(Arrays.toString(input[i]));
		}
	}
}
