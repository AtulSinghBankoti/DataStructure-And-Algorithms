package leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FlowerPlantingWithNoAdjacent {

	public int[] gardenNoAdj(int N, int[][] paths) {
        
		
		int color[] =new int[N];
        
        for(int i=1; i<=N; i++){
            Set<Integer> s= new LinkedHashSet<>();
            s.add(1);s.add(2);s.add(3);s.add(4);
            for(int j=0; j<paths.length; j++){
                if(paths[j][0]==i){
                    s.remove(color[paths[j][1]-1]);
                }else if(paths[j][1]==i) {
                	s.remove(color[paths[j][0]-1]);
                }
            }
           
            color[i-1]=s.iterator().next();
        }
        
        
       return color;
    }
	
	
	public static void main(String[] args) {
		int N = 3;
		int [][] paths = {{1,2},{2,3},{3,1}};
		System.out.println(Arrays.toString(new FlowerPlantingWithNoAdjacent().gardenNoAdj(N, paths)));
		 
		N = 4;
		int [][] paths2 = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
		System.out.println(Arrays.toString(new FlowerPlantingWithNoAdjacent().gardenNoAdj(N, paths2)));
		
		N = 4; 
		int [][] paths3 = {{1,2},{3,4}};
		System.out.println(Arrays.toString(new FlowerPlantingWithNoAdjacent().gardenNoAdj(N, paths3)));	
	}

}
