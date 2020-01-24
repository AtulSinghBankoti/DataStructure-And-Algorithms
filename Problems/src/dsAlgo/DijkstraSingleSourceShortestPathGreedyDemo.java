package dsAlgo;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class DijkstraSingleSourceShortestPathGreedyDemo {

	class Node{
		private String name;
		private int index;
		private int weightFromSource;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWeightFromSource() {
			return weightFromSource;
		}
		public void setWeightFromSource(int weightFromSource) {
			this.weightFromSource = weightFromSource;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		@Override
		public String toString() {
			return "Node[name=" + name + ",weightFromSource=" + weightFromSource + "]";
		}
	}
	
	void minHipify(LinkedList<Node> list,int i,int length){
		int l=2*i+1;
		int r=2*i+2;
		int minimum=i;
		if(l<length && list.get(l).getWeightFromSource()<list.get(i).getWeightFromSource()){
			minimum=l;
		}
		
		if(r<length && list.get(r).getWeightFromSource()<list.get(minimum).getWeightFromSource()){
			minimum=r;
		}
		
		if(minimum!=i){
			Node node=list.get(i);
			list.set(i, list.get(minimum));
			list.set(minimum, node);
			minHipify(list, minimum, length);
		}
	}
	
	 void buildMinHeap(LinkedList<Node> list){
		for(int i=list.size()/2;i>=1;i--){
			minHipify(list, i, list.size());
		}
	}
	
	
	Node extractMin(LinkedList<Node> list){
		if(list.size()!=0){
			minHipify(list, 0, list.size()); 
		}
		Node node=list.get(0);
		list.set(0, list.getLast());
		list.removeLast();
		return node;
	}
	
	Set<Node> singleSourceShortestPth(String graph[],int weightMatrix[][],int source){
		int g[]=new int [graph.length+1];
		for(int i=1;i<g.length;i++)
			if(i!=source)
				g[i]=Integer.MAX_VALUE;
		
		g[source]=0;
		LinkedList<Node> q=new LinkedList<>();
		for(int i=1;i<graph.length;i++){
			Node node=new Node();
			node.setName(graph[i]);
			node.setIndex(i);
			node.setWeightFromSource(g[i]);
			q.add(node);
		}
		buildMinHeap(q);
		LinkedHashSet<Node> set=new LinkedHashSet<>();
		while(!q.isEmpty()){
			Node node=extractMin(q);
			set.add(node);
			for(Node n:q)
				if(weightMatrix[node.getIndex()][n.getIndex()]!=0 && weightMatrix[node.getIndex()][n.getIndex()]+node.getWeightFromSource()<n.getWeightFromSource())
					n.setWeightFromSource(weightMatrix[node.getIndex()][n.getIndex()]+node.getWeightFromSource());	
		}
		return set;
	}
	
	public static void main(String[] args) {
		String graph[]={"","P","Q","R","S","T","U"};
		int weightMatrix[][]={{0,0,0,0,0,0,0,0},
							  {0,0,1,0,6,7,0,0},
							  {0,0,0,1,4,0,0,0},
							  {0,0,0,0,2,0,1,0},
							  {0,0,0,0,0,3,2,0},
							  {0,0,0,0,0,0,2,0},
							  {0,0,0,0,0,0,0,0},
							  {0,0,0,0,0,0,0,0},
							  };
		int source=1;
		System.out.println(new DijkstraSingleSourceShortestPathGreedyDemo().singleSourceShortestPth(graph, weightMatrix, source));
	}
}



