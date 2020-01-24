package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EightNineGame {

	static List<Integer> list=new ArrayList<>();
	void printAllParmu(int arr[],int i){
		if(i<1){
			if(arr[0]!=9){
				String s="";
				int count8=0;
				int count9=0;
				for(int j:arr){
					if(j==8)count8++;
					else count9++;
					s+=j;
					if(count9>count8){	
						return;
					}
				}
				int c8=s.replaceAll("9", "").length();
				int c9=s.replaceAll("8", "").length();
				if(c8==c9 || c9>c8  ){
					list.add(Integer.parseInt(s));
				
				}
			}
		}else{
				arr[i-1]=8;
				printAllParmu(arr, i-1);
				arr[i-1]=9;
				printAllParmu(arr, i-1);
		}
	}
	
	public static void main(String[] args) {
		new EightNineGame().printAllParmu(new int[4],4);
		Collections.sort(list);
		System.out.println(list);
	}

}
