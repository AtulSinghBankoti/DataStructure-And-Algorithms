package dsAlgo;

import java.util.stream.Stream;

public class StringCombo {

	int arr[]=new int[4];
	void allCombintion(int n){
		if(n<1){
			for(int i:arr)
				System.out.print(""+i);
			System.out.println();
		}else{
			arr[n-1]=0;
			allCombintion(n-1);
			arr[n-1]=1;
			allCombintion(n-1);
		}
		
	}
	
	public static void main(String[] args) {
	  //	new StringCombo().allCombintion(4);
	  	new StringCombo().k_String(4, 2);
	}
	
	
	
	void k_String(int n,int k){
		if(n<1){
			for(int i:arr)
				System.out.print(""+i);
			System.out.println();
		}else{
			for(int j=0;j<k;j++){
				arr[n-1]=j;
				k_String(n-1, k);
			}
		}
		
	}

}
