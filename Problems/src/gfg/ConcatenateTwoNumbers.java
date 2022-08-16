package gfg;

public class ConcatenateTwoNumbers {

	
	long countPairs(int N, int X, int numbers[]) 
    { 
		 if(N<1){
	            return 0;
	        }
	        
	        String temp = ""+X;
	        int res = 0;
	        for(int  i=0; i<temp.length(); i++){
	            
	            String st1 =temp.substring(0, i+1);
	            String st2 = temp.substring(i+1, temp.length());
	            if(!st1.isEmpty() && !st2.isEmpty()) {
	                int flag1  = 0;
	                int flag2  = 0;
	                for(int e:numbers) {
	                	if(st1.equals(""+e)) 
	                		flag1++;
	                	if(st2.equals(""+e))
	                		flag2++;
	                	
	                }
	                if(st1.equals(st2)) {
	                	res += flag1 * (flag1-1);
	                }else {
	                	 if(flag1>0 && flag2>0) {
	 	                    res= res+ (flag1*flag2);
	 	                }
	                }
	               
	            } 
	        }
	        
	        return res;
    }
	
	public static void main(String[] args) {
		System.out.println(new ConcatenateTwoNumbers().countPairs(4, 1212,new int[] {1, 212, 12, 12}));
	}

}
