package leetcode;


public class ContainerWithMostWater {

	 public int maxArea(int[] height) {
		 	int l = 0 ;
		 	int r = height.length-1;
		 	
		 	int max_area=0;
		 	
		 	while(l<r) {
		 		int temp=0;
		 		int min= Integer.min(height[l], height[r]);
		 		if((temp= min*(r-l)) > max_area) {
		 			max_area = temp;
		 		}
		 		
		 		if(min==height[l]) {
		 			l++;
		 		}else {
		 			r--;
		 		}
		 	}
		
		 	return max_area;
	 }
	 



	public static void main(String[] args) {
		System.out.println(new ContainerWithMostWater().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
		System.out.println(new ContainerWithMostWater().maxArea(new int[] {1,1}));
		System.out.println(new ContainerWithMostWater().maxArea(new int[] {1,2,1}));
	}

}
