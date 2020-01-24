package dsAlgo;

import java.util.Arrays;

public class FibbonacciDynamicProgrammingDemo {

	int arr[]=new int[10];
	{
		Arrays.fill(arr, -1);
	}
	public int fibbo(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			if(arr[n]!=-1)
				return arr[n];
			else
				return fibbo(n-2)+fibbo(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new FibbonacciDynamicProgrammingDemo().fibbo(4));

	}

}
