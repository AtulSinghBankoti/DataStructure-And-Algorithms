package practice;

import java.util.ArrayList;
import java.util.List;

public class OrangesRotting {

	
	 public int orangesRotting(int[][] grid) {
	        boolean flag=true;    
	        int res =0;
	        
	        
	        
	        while(flag) {
	        	List<String> list= new ArrayList<>();
	        	for(int i=0; i<grid.length; i++) {
	        		for(int j=0; j<grid[i].length; j++) {
	        			 if(grid[i][j] == 2) {
	        				
	        				 if(j<grid[i].length-1 && grid[i][j+1]==1) {
	        					 list.add(i+"-"+(j+1));
	        				 }
	        				 
	        				 if(j>0 && grid[i][j-1]==1) {
	        					 list.add(i+"-"+(j-1));
	        				 }
	        				 
	        				 if(i>0 && grid[i-1][j]==1) {
	        					 list.add((i-1)+"-"+j);
	        				 }
	        				 
	        				 if(i<grid.length-1 && grid[i+1][j]==1) {
	        					 list.add((i+1)+"-"+j);
	        				 }
	
	        			 }			
	        		}
	        	}
	        	
	        	if(list.isEmpty()) {
	        		//System.out.println("here>");
	        		flag=false;
	        	}else {
	        		//System.out.println("here>>");
	        		res++;
	        		for(String s: list) {
	        			//System.out.println("s>>"+s);
	        			String temp[] = s.split("-");
	        			grid[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])]=2;
	        		}
	        	}
	        }
	        
	        for(int i=0; i<grid.length; i++) {
	        	for(int j=0; j<grid.length; j++) {
	        		if(grid[i][j] == 1) {
	        			flag=true;
	        			break;
	        		}
	        	}
	        }
	        
	        
	        return flag?-1:res;
	    }
	
	
	
	
	public static void main(String[] args) {
			int [][] input =  {{2,1,1},{1,1,0},{0,1,1}};
			
			int [][]input2=  {{2,1,1},{0,1,1},{1,0,1}};
			OrangesRotting rotting =new OrangesRotting();
			System.out.println(rotting.orangesRotting(input2));
			
	}

}
