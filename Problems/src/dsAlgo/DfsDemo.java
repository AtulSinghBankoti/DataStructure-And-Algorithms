package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class DfsDemo {

	static boolean visited[]=new boolean[9];
	static Stack<Integer> stack=new Stack<>();
	static int graph[][]=new int [9][9];
	static ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();   
	
	
	public static void main(String[] args) {
		graph[1][2]=1;graph[1][3]=1;
		graph[2][4]=1;graph[2][5]=1;
		graph[3][6]=1;graph[3][7]=1;
		graph[4][8]=1;graph[5][8]=1;
		graph[6][8]=1;graph[7][8]=1;
		bfsMatrix(1);
		
		ArrayList<Integer> list0=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(2);list1.add(3);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(4);list2.add(5);
		ArrayList<Integer> list3=new ArrayList<>();
		list3.add(6);list3.add(7);
		ArrayList<Integer> list4=new ArrayList<>();
		list4.add(8);
		ArrayList<Integer> list5=new ArrayList<>();
		list5.add(8);
		ArrayList<Integer> list6=new ArrayList<>();
		list6.add(8);
		ArrayList<Integer> list7=new ArrayList<>();
		list7.add(8);
		ArrayList<Integer> list8=new ArrayList<>();
		list.add(list0);
		list.add(list1);list.add(list2);list.add(list3);list.add(list4);
		list.add(list5);list.add(list6);list.add(list7);list.add(list8);
		stack.clear();
		Arrays.fill(visited, false);
		bfAdjencyList(1);
	}
	
	
	static void bfsMatrix(int i){
		stack.push(i);
		while(!stack.isEmpty()){
			int v=stack.pop();
			if(visited[v]==false){
				visited[v]=true;
				System.out.print(v+" ");
				for(int j=1;j<graph.length;j++){
					if(graph[v][j]==1 && visited[j]==false){
						stack.push(j);
					}
				}
			}
		}
		System.out.println();
	}
	
	
	static void bfAdjencyList(int i){
		stack.push(i);
		while(!stack.isEmpty()){
			int v=stack.pop();
			if(visited[v]==false){
				visited[v]=true;
				System.out.print(v+" ");
				Iterator<Integer> iterator=list.get(v).iterator();
				while(iterator.hasNext()){
					int v2=iterator.next();
					if(visited[v2]==false){
						stack.push(v2);
					}
				}
			}
		}
		System.out.println();
	}


}
