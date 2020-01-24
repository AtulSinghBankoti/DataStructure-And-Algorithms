package graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node{
	
	public int p=0;
	//public char vertex;
	public int distance;
	public int path;
	
	public Node(int p, int distance, int path) {
		super();
		this.p = p;
		//this.vertex = vertex;
		this.distance = distance;
		this.path = path;
	}
	
}

public class BellmanFordShortestPath {

	/*A->B,C
	B->E
	C->B,D
	D->E
	E->*/
	
	public static int input [][]= {{0,4,1,0,0},
								   {0,0,0,0,4},
								   {0,2,0,4,0},
								   {0,0,0,0,4},
								   {0,0,0,0,0}
									};
	
	
	static int[] bellmanFordShortestPath(int [][]input){
		int distance []= new int[input.length];
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0]=0;
		
		Node n =new Node(0, distance[0], 0);
		
		PriorityQueue<Node> pq = new PriorityQueue<>((n1,n2)-> (n1.distance==n2.distance)? 0 :
			(n1.distance>n2.distance)?1:-1);
		pq.add(n);
		
		while(!pq.isEmpty()) {
			Node v= pq.poll();
			for(int i=0; i<input.length; i++) {
				if(input[v.p][i]!=0) {
					int d= distance[v.p]+input[v.p][i];
					if(distance[i]>d) {
						distance[i]=d;
						pq.add(new Node(i, d, v.p));
					}
						
				}
			}
			
		}
		
		return distance;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(bellmanFordShortestPath(input)));
	}

}
