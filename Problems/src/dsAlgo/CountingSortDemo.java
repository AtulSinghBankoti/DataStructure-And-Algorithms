package dsAlgo;

public class CountingSortDemo {

	static int arr[]={1,2,3,4,5,2,2,6,9,10};
	static int count[]=new int[11];
	static int B[]=new int[arr.length];
	public static void countingSort(int [] arr){
		for(int i=0;i<arr.length;i++){
			count[arr[i]]++;
		}
		
		for(int i=1;i<count.length;i++){
			count[i]=count[i-1]+count[i];
		}
			
		
		for(int j=arr.length-1;j>=0;j--){	
		  
			B[count[arr[j]]-1]=arr[j];
			count[arr[j]]=count[arr[j]]-1;
		}
		
		
			
	}
	
	public static void main(String[] args) {
		System.out.println("arr->1,2,3,4,5,2,2,6,9,10");
		countingSort(arr);
		for(int j=0;j<B.length;j++){
			System.out.print(B[j]+" ");
		}
		System.out.println();
	}

}
