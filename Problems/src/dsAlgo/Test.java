package dsAlgo;

import java.util.Arrays;



public class Test {

	static boolean check(int arr[]){
        int counter=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==-999)
                counter++;
        
        if(counter == arr.length-1)
            return false;
        else 
            return true;
        
    }
    
    static int findPosition(int arr[]){
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=-999)
                return i;
        return -1;
    }
    
    static int find2ndPosition(int arr[],int j){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-999){
                j--;
                if(j<0)
                    return i; 
                
            }
        }
        return -1;
        
    }
    
	public static void main(String[] args) {
	    int arr[]={1,2,3};
	    
	    while(check(arr)){
	        int j=0;
	        int counter=1;
	        for(int i=0;i<arr.length;){
	               int p;
	               if(j==0){
	                    p=findPosition(arr);
	                    j++;
	               }else{
	                   p=find2ndPosition(arr,counter++);
	               }
	               
	               if(p==-1){
	                   break;
	               }else{
	                   arr[p]=-999;
	                   i=p;
	               } 
	        }
	   }
	   System.out.println("no:"+arr[findPosition(arr)]);
	   
	  
	   
	}

}
