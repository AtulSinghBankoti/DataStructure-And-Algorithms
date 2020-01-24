package dsAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AlgoSelection {

	public  int solve(List<List<Integer>> profits) {
		int res=0;
		for(int i=0;i<profits.get(0).size();i++) {
			int arr[]=new  int [profits.size()];
			arr[0]=i;
			res=0;
			for(int j=1;j<profits.size();j++) {
				int h=findMax(profits.get(j),arr,j);
				arr[j]=h;
				res+=profits.get(j).get(h);
			}
		}
		return res;
	}
	
	
	int findMax(List<Integer> list,int arr[],int p){
		boolean flag=true;
		Map<Integer,Integer>map= new TreeMap<>();
		for(int i=0;i<list.size();i++) {
			map.put(i,list.get(i));
		}
		map.keySet();
		while(flag) {
			
		}
		return 0;
	}
	
	Map<Integer,Integer> sort(Map<Integer, Integer> m){
		Set<Integer> set=m.keySet();
		Map<Integer, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<set.size()-1;i++) {
			for(int j=0;j<set.size()-i;j++) {
				if(m.get(j)<m.get(j+1)) {
					
				}
			}
		}
		
		return m;
	}
	
	int max(List<Integer> list,int i) {
		int m=0;
		for(int e: list) {
			if(e>m && e<i) {
				m=e;
			}
		}
		return m;
	}
	
	
	
	public void sol(int i) {
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(20);l1.add(30);l1.add(40);
		List<Integer> l2=new ArrayList<>();
		l2.add(60);l1.add(70);l1.add(80);l1.add(110);
		new AlgoSelection().solve(lists);
	}
	
	public static void main(String[] args) {
		

	}

}
