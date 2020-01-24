package dsAlgo;

import java.util.Collections;
import java.util.HashSet;

import javax.management.MXBean;

public class AppleOrchid {

	
	/*int collectMaxApples(int input1,int input2[]){
		int maxApple=0;
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<input1;i++){
			int min=Integer.MAX_VALUE;
			for(int j=i;j<input1;j++){
				if(input2[j]<min)min=input2[j];
			}
			System.out.println("min::>"+min);
			if(!(set.contains(min))){
				set.add(min);
				int temp=min*(input1-i);
				System.out.println("temp>"+temp);
				if(temp>maxApple)
					maxApple=temp;
			}
			
		}
		return maxApple;
	}*/
	
	int collectMaxApples2(int input1,int input2[]){
		int maxApple=Integer.MIN_VALUE;
		for(int i=0;i<input2.length;i++){
			int tmp=0,c=0;
			
			for(int p1=i;p1>=0;p1--){
				//System.out.println("input2[p1]<input2[i]"+(input2[p1]<input2[i]));
				if(input2[p1]<input2[i]){
					break;
				}else{
					c++;
				}
			}
			
			for(int p2=i+1;p2<input2.length;p2++){
				if(input2[p2]<input2[i]){
					break;
				}else{
					c++;
				}
			}
			
			/*
			for(int p1=i,p2=i+1;(p1>=0 || p2<input2.length); p1--,p2++){
				if(p1>=0){
					System.out.println("input2[p1]<input2[i]"+(input2[p1]<input2[i]));
					if(input2[p1]<input2[i]){
						break;
					}else{
						c++;
					}
				}		
		
				if(p2<input2.length){
					System.out.println("input2[p2]<input2[i]"+(input2[p2]<input2[i]));
					if(input2[p2]<input2[i]){
						break;
					}else{
						c++;
					}
				}
			}*/
			System.out.println("c>"+c);
			tmp=c*input2[i];
			if(tmp>maxApple){
				maxApple=tmp;
			}
		}
		return maxApple;
	}
	
	public static void main(String[] args) {
	    int input1=3;
		int input2[]={80,48,82};
		/*for(int i=0;i<input2.length;i++)
			System.out.print(" "+input2[i]);
		System.out.println();*/
		System.out.println(new AppleOrchid().collectMaxApples2(input1, input2));
	}

}
