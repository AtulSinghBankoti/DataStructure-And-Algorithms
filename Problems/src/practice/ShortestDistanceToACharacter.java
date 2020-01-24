package practice;

import java.util.Arrays;
import org.junit.*;


public class ShortestDistanceToACharacter {

	public int[] shortestToChar(String S, char C) {
		int [] output =new int[S.length()];

		Arrays.fill(output, Integer.MAX_VALUE);
		for(int i=0; i<S.length(); i++){
			if(S.charAt(i)=='e') {
				int c=0;
				for(int j=i; j<S.length();j++) {
					if(output[j]>c) {
						output[j]=c;
					}
					c++;
				}
				c=0;
				for(int j=i;j>=0;j--) {
					if(output[j]>c) {
						output[j]=c;
					}
					c++;
				}
			}
		}
		return output;
	}


	//@Test  
	public void main() {
		ShortestDistanceToACharacter distanceToACharacter=new ShortestDistanceToACharacter();
		int res[]=distanceToACharacter.shortestToChar("loveleetcode", 'e');
		//System.out.println(Arrays.toString(res));
		Assert.assertArrayEquals(res,new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0});
	}

}
