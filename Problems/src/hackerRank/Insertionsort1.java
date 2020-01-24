package hackerRank;

/*
 * 
 * link: https://www.hackerrank.com/challenges/insertionsort1/problem
 */

public class Insertionsort1 {

	static void insertionSort1(int n, int[] arr) {
        /*
            10
            2 3 4 5 6 7 8 9 10 1
        */
        int p=arr[n-1];
        for(int i=n-2; i>=0; i--){ 
            if(p<arr[i]){
                arr[i+1]=arr[i];
            }else{
                arr[i+1]=p;
            }

            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j]+" ");
            }

            boolean flag=true;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>=arr[j+1]){
                    flag=false;
                }
            }
            if(flag){            	
                break;
            }
            System.out.println();
        }
        
        if(p<arr[0]) {
        	arr[0]=p;
        	
        	 for(int j=0; j<arr.length; j++){
                 System.out.print(arr[j]+" ");
             }
        }


    }
	
	public static void main(String[] args) {
		insertionSort1(10,new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 1});

	}

}
