package dsAlgo;

import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TSPIterativeDynamicProgramming {


	private final int N,start;
	private final double[][] distance;
	private List<Integer> tour=new ArrayList<>();
	private double minTourCost=Double.POSITIVE_INFINITY;
	private boolean ranSolver=false;
	
	public TSPIterativeDynamicProgramming(double[][] distance) {
		this(0,distance);
	}
	
	public TSPIterativeDynamicProgramming(int start,double[][] distance) {
		N=distance.length;
		if(N<=2) throw new IllegalStateException("N<=2 not yet supported.");
		if(N!=distance[0].length)throw new IllegalStateException("matrix must be square.");
		if(start<0 || start>=N)throw new IllegalStateException("Invalid start node");
		
		this.start=start;
		this.distance=distance;
	} 
	
	public List<Integer> getTour(){
		if(!ranSolver)solve();
		return tour;
	}
	
	private void solve() {
		if(ranSolver)return;
		
		final int END_STATE=(1 << N) - 1;
		Double[][] memo=new Double[N][1<<N];
		
		for(int end=0; end<N; end++) {
			if(end == start)continue;
			memo[end][(1 << start) | (1 << end)] = distance[start][end];
		}
		
		for(int  r=3;r<=N;r++) {
			for(int subset: combinations(r,N)) {
				if(notIn(start,subset))continue;
				for(int next=0;next<N;next++) {
					if(next==start ||  notIn(next,subset))continue;
					int subsetWithoutNext =subset ^ (1 << next);
					double minDist = Double.POSITIVE_INFINITY;
					for(int end=0;end<N;end++) {
						if(end == start || end ==next || notIn(end,subset))continue;
						double newDistance=memo[end][subsetWithoutNext]+distance[end][next];
						if(newDistance<minDist) {
							minDist=newDistance;
						}
					}
					memo[next][subset]=minDist;
				}
			}
		}
		
		
		for(int i=0;i<N;i++) {
			if(i==start)continue;
			double tourCost=memo[i][END_STATE]+distance[i][start];
			if(tourCost < minTourCost) {
				minTourCost= tourCost;
			}
		}
		
		
		int lastIndex=start;
		int state=END_STATE;
		tour.add(start);
		
		for(int i=1;i<N;i++) {
			int index=-1;
			for(int j=0;j<N;j++) {
				if(j==start || notIn(j,state))continue;
				if(index== -1)index=j;
				double prevDist=memo[index][state]+distance[index][lastIndex];
				double newDist=memo[j][state]+distance[j][lastIndex];
				if(newDist<prevDist) {
					index=j;
				}
			}
			
			tour.add(index);
			state=state^(1<<index);
			lastIndex=index;
		}
		
		tour.add(state);
		Collections.reverse(tour);
		ranSolver=true;
	}

	private boolean notIn(int elem, int subset) {
		return ((1<<elem) & subset)==0;
	}

	private List<Integer> combinations(int r, int n) {
		List<Integer> subsets=new ArrayList<>();
		combinations(0,0,r,n,subsets);
		return subsets;
	}

	private void combinations(int set, int at, int r, int n, List<Integer> subsets) {
		int elementsToPick = n-at;
		if(elementsToPick<r)return;
		
		if(r==0) {
			subsets.add(set); 
		}else {
			for(int i=at; i<n;i++) {
				set |=1<<i;
				combinations(set, i+1, r, n, subsets);
				set &= ~(1 << i);
			}
		}
		
	}

	public static void main(String[] args) {
		double mat[][]= {
				         {0,7,1,0,6},
				         {7,0,2,4,0},
				         {1,2,0,3,0},
				         {0,4,3,0,9},
				         {6,0,0,9,0}
				        };
		int startNode=0;
		TSPIterativeDynamicProgramming solver=new TSPIterativeDynamicProgramming(startNode, mat);
		
		System.out.println("Tour: "+solver.getTour());
		System.out.println("Tour cost:"+solver.minTourCost);
	}

}
