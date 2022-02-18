package leetcode;

/**
 * @author ADMIN
 * Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalNum = nums1.length + nums2.length;
		if(totalNum <= 1) {
			if(nums1.length == 1) {
				return nums1[0];
			}else {
				return nums2[0];
			}
		}else {
			int half = (int)Math.ceil((double)totalNum/2); //totalNum/2;
			int counter=0;
			if(totalNum % 2 ==0 ) {
				int m1=0;
				int num1Pointer=0;
				int num2Pointer=0;
				while(num1Pointer < nums1.length && num2Pointer < nums2.length) {
					if(nums1[num1Pointer] < nums2[num2Pointer]) {
						++counter;
						if(counter == half) {
							m1=nums1[num1Pointer];
							num1Pointer++;
						}else if(counter == half+1) {
							return  (double)(m1+nums1[num1Pointer])/2;
						}else {
							num1Pointer++;
						}
					}else {
						++counter;
						if(counter == half) {
							m1=nums2[num2Pointer];
							num2Pointer++;
						}else if(counter == half+1) {
							return  (double)(m1+nums2[num2Pointer])/2;
						}else {
							num2Pointer++;
						}
					}
				}
				
				while(num1Pointer < nums1.length) {
					++counter;
					if(counter == half) {
						m1=nums1[num1Pointer];
						num1Pointer++;
					}else if(counter == half+1) {
						return  (double)(m1+nums1[num1Pointer])/2;
					}else {
						num1Pointer++;
					}
				}
				
				while(num2Pointer < nums2.length) {
					++counter;
					if(counter == half) {
						m1=nums2[num2Pointer];
						num2Pointer++;
					}else if(counter == half+1) {
						return  (double)(m1+nums2[num2Pointer])/2;
					}else {
						num2Pointer++;
					}
				}
				
				
			}else {
				int num1Pointer=0;
				int num2Pointer=0;
				while(num1Pointer < nums1.length && num2Pointer < nums2.length) {
					if(nums1[num1Pointer] < nums2[num2Pointer]) {
						if(++counter == half) {
							return nums1[num1Pointer];
						}else {
							num1Pointer++;
						}
					}else {
						if(++counter == half) {
							return nums2[num2Pointer];
						}else {
							num2Pointer++;
						}
					}
				}
				
				while(num1Pointer < nums1.length) {
					if(++counter == half) {
						return nums1[num1Pointer];
					}else {
						num1Pointer++;
					}
				}
				
				while(num2Pointer < nums2.length) {
					if(++counter == half) {
						return nums2[num2Pointer];
					}else {
						num2Pointer++;
					}
				}
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("{1,3}{2}"+new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
		System.out.println("{1,2}{3,4}"+new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
		System.out.println("{}{2,3}"+new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[] {}, new int[] {2,3}));
	}

}
