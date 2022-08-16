package gfg;

public class MinimumNumberOfJumps {
	
	static int minJumps(int[] arr){
        int res =0;
        int p=0;
        for(int i=0; i<arr.length;){
            p= p+arr[i];
            res++;
            if(p>=arr.length){
                break;
            }
            i=p;
        }
        return res;
    }

	public static void main(String[] args) {
		//int res = minJumps(new int[] {1, 4, 3, 2, 6, 7});
		int res = minJumps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9});
		
		System.out.println(res);
	}

}
