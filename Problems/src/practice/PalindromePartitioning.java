package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * link: https://leetcode.com/problems/palindrome-partitioning/
 * 
 */

public class PalindromePartitioning {

	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<>();

		if (s == null || s.equals(""))
			return res;

		char[] chars = s.toCharArray();

		/*  ------------------------------------------------------------------------- *
		 *	isPalindrome[i][j] (i <= j) means if String[i] to String[j] is Palindrome *
		 *  ------------------------------------------------------------------------- */
		boolean[][] isPalindrome = new boolean[s.length()][s.length()];

		setIsPalindrome(chars, isPalindrome);

		/*
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				System.out.print(isPalindrome[i][j] + " ");
			}
			System.out.println();
		}
		*/

		output(s, isPalindrome, 0, res, new ArrayList<String>());

		return res;
	}

	public void setIsPalindrome(char[] s, boolean[][] isPalindrome) {
		if (s == null || s.length == 0) {
			return;
		}

		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = i; j < s.length; j++) {
				if (s[i] == s[j]) {
					if (j <= i + 2) {
						isPalindrome[i][j] = true;
					}
					else {
						isPalindrome[i][j] = isPalindrome[i + 1][j - 1];
					}
				}
			}
		}
	}

	public void output(String s, boolean[][] isPalindrome, int start_i, List<List<String>> res, List<String> path) {
		int n = isPalindrome.length;
		if (start_i == n) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int j = start_i; j < n; j++) {
			if (isPalindrome[start_i][j]) {
				path.add(s.substring(start_i, j+1));
				output(s, isPalindrome, j + 1, res, path);
				path.remove(path.size() - 1);
			}
		}
	}

}
