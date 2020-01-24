package dsAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TravellingSalseManProblem {

	List<String> li=new ArrayList<>();
	void permute(String s,int l){
		if(s.length()==l) {
			li.add(s);
		}else{
			for(int i=l;i<s.length();i++) {
				s=swap(s, l,i);
				permute(s, l+1);
				s=swap(s, l, i);
			}
		}
	}
	
	String swap(String s,int l,int h) {
		char ch[]=s.toCharArray();
		char c=ch[l];
		ch[l]=ch[h];
		ch[h]=c;
		return new String(ch);
	}
	
	void printShortestPath(int [][]mat, String s,int source){
		permute(s, 0);
		String maxPath="";
		int maxWeight=0;
		for(String st:li) {
			char []ch=st.toCharArray();
			if(mat[source][Integer.parseInt(""+ch[0])]!=0 && mat[source][Integer.parseInt(""+ch[ch.length-1])]!=0) {
				int maxTemp=0;
				maxTemp+=mat[source][Integer.parseInt(""+ch[0])];
				for(int i=1;i<ch.length;i++) {
					
					maxTemp+=mat[Integer.parseInt(""+ch[i-1])][Integer.parseInt(""+ch[i])];
				}
				maxTemp+=mat[Integer.parseInt(""+ch[ch.length-1])][source];
				if(maxTemp>maxWeight) {
					maxWeight=maxTemp;
					maxPath=st;
				}
			}
		}
		System.out.println("shortest path="+source+" "+maxPath+" "+source);
		System.out.println("shortest weight="+maxWeight);
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*int mat[][]= {{0,0,0,0,0},
					  {0,0,7,1,0,6},
					  {0,7,0,2,4,0},
					  {0,1,2,0,3,0},
					  {0,0,4,3,0,9},
					  {0,6,0,0,9,0}
					  };*/
		
		int mat[][]= {
		         {0,7,1,0,6},
		         {7,0,2,4,0},
		         {1,2,0,3,0},
		         {0,4,3,0,9},
		         {6,0,0,9,0}
		        };
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter source from 1 to 5");
		int n=Integer.parseInt(br.readLine());
		String s="";
		for(int i=0;i<=4;i++) {
			if(n!=i) {
				s+=i;
			}
		}
		new TravellingSalseManProblem().printShortestPath(mat, s, n);
	}
	

}
