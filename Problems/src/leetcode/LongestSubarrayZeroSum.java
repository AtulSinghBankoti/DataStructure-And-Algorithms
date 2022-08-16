package leetcode;
import java.util.*;

public class LongestSubarrayZeroSum {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr)     {

		int res=0;
		for(int i=0; i<arr.size(); i++) {
			int count=0;
			int sum=0;
			for(int j=i; j<arr.size(); j++) {
				sum += arr.get(j);
				count++;
				if(sum==0 && count>res) {
					res=count;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(-1);
		arr.add(4);
		arr.add(-4);
		System.out.println(new LongestSubarrayZeroSum().LongestSubsetWithZeroSum(arr));

	}

}
