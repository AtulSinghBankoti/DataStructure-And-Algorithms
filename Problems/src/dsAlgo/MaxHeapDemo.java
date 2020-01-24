package dsAlgo;

public class MaxHeapDemo {

	//static int arr[]={1,2,3,4,5,6,7};
	
	static int arr[]={40,30,20,5,3,2};
	
	
	
	static public void maxHeapify(int []arr,int i){
			int lp=0;
			int rp=0;
			lp=i*2+1;
			rp=i*2+2;
			int t=0;
			int largest=i;
			if(lp<arr.length && arr[i]<arr[lp]){
				largest=lp;
			} 
			
			if(rp<arr.length && arr[largest]<arr[rp]){
				largest=rp;
			}
			if(largest!=i){
				int tmp=arr[i];
				arr[i]=arr[largest];
				arr[largest]=tmp;
				maxHeapify(arr, largest);
			}
	}
	
	static public void buildMaxHeap(){
		for(int i=arr.length/2;i>=0;i--){
		  maxHeapify(arr, i);
		}
	}
	
	public static void main(String[] args) {
		buildMaxHeap();
		for(int i:arr){
			System.out.print(" "+i);
		}
		System.out.println();
	}

}
