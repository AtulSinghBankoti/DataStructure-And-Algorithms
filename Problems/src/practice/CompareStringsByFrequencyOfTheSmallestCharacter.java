package practice;

import java.util.Arrays;

/*
 * link: https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
 * 
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {

	public int[] numSmallerByFrequency(String[] queries, String[] words) {
		int q[] = new int[queries.length];
		int w[] = new int[words.length];
		
		int output[] =new int[queries.length];
	
		for(int i=0; i<queries.length; i++) {
			int c=0;
			int m=Integer.MAX_VALUE;
			char t []= queries[i].toCharArray();

			for(int ind=0; ind<t.length; ind++) {
				if(t[ind]<m) {
					m=t[ind];
				}
			}

			for(int ind=0; ind<t.length; ind++){
				if(t[ind]==m) {
					c++;
				}
			}

			q[i] = c;
		}
		
		
		for(int i=0; i<words.length; i++) {
			int c=0;
			int m=Integer.MAX_VALUE;
			char t []= words[i].toCharArray();

			for(int ind=0; ind<t.length; ind++) {
				if(t[ind]<m) {
					m=t[ind];
				}
			}

			for(int ind=0; ind<t.length; ind++){
				if(t[ind]==m) {
					c++;
				}
			}

			w[i] = c;
		}
		
		for(int i=0;i<q.length;i++) {
			int counter=0;
			for(int j=0; j<w.length; j++) {
				if(q[i]<w[j]) {
					counter++;
				}
			}
			
			output[i]=counter;
		}
		
		return output;
	}

	public static void main(String[] args) {
		String[] queries= {"bbb","cc"};  
		String[] words = {"a","aa","aaa","aaaa"};

		CompareStringsByFrequencyOfTheSmallestCharacter smallestCharacter =new CompareStringsByFrequencyOfTheSmallestCharacter();
		System.out.println(Arrays.toString(smallestCharacter.numSmallerByFrequency(queries, words)));
	}

}
