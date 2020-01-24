package practice;



/*
 * link:https://leetcode.com/problems/jewels-and-stones/ 
 * 
 */

public class JewelsAndStones {

	public int numJewelsInStones(String J, String S) {
	
		int counter=0;
		for(char ch: S.toCharArray()) {
			if(J.contains(""+ch)) {
				counter++;
			}
		}
		
		return counter;
	}

	public static void main(String[] args) {
		JewelsAndStones jewelsAndStones=new JewelsAndStones();
		int res= jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
		System.out.println(res);
	}

}
