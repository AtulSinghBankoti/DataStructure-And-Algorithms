package dsAlgo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SysbisDemo {

	static int getMin(int input1,int input2,int input3[]){
		
		if(input2>=input3.length){
			return -1;
		}else{
			Arrays.sort(input3);
			int counter=0;
			int i=0;
			int n=input1/input2;
			ArrayList<Integer> list=new ArrayList<>();
			for(int e:input3){
				list.add(e);
			}
			
			while(i<n){
				ArrayList<Integer> tmpList=new ArrayList<>();
				for(int k=0;k<input3.length;k++){
					if(input3[k]!=-99 && !tmpList.contains(input3[k]) 
							&& tmpList.size()!=input2){
						tmpList.add(input3[k]);
						input3[k]=-99;
						if(tmpList.size()==input2){
							int diff=tmpList.get(tmpList.size()-1)-tmpList.get(0);
							counter+=diff;
							System.out.println("tmpList:>"+tmpList+" diff:>"+diff);
							tmpList.clear();
							i++;
							break;
						}
					}
				}
			}
			
			return counter;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getMin(12, 4, new int[]{1,2,3,3,4,5,6,6,7,8,9,10,11}));
	}

}
