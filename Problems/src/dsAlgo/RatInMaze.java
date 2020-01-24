package dsAlgo;

import java.util.Arrays;

public class RatInMaze {

	
	boolean findPath(int [][]maze,int i,int j,int sol[][]){
		
		if(i==maze.length-1 && j==maze.length-1){
			System.out.println("i"+i+" j"+j);
			sol[i][j]=1;
			return true;
		}else if(j+1< maze.length && maze[i][j+1]==1 ){
			sol[i][j]=1;
			return findPath(maze, i, j+1,sol);
		}else if(i+1<maze.length && maze[i+1][j]==1){
			sol[i][j]=1;
			return findPath(maze, i+1, j,sol);
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int maze[][]={{1,0,0,0},
					  {1,1,0,1},
					  {0,1,0,0},
					  {1,1,1,1}
						};
		int sol[][]={{0,0,0,0},
				     {0,0,0,0},
				     {0,0,0,0},
				     {0,0,0,0}
					};
		System.out.println(new RatInMaze().findPath(maze, 0, 0, sol));
		System.out.println("solution...!!!");
		for(int arr[]:sol)
			System.out.println(Arrays.toString(arr));
	}

}
