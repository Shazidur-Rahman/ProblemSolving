/*
Given a non-empty sequence of characters str, return true if sequence
is Binary, else return false
Example 1:
Input:
str = 101
Output:
1
Explanation:
Since string contains only 0 and 1, output is 1.
Example 2:
Input:
str = 75
Output:
0
Explanation:
Since string contains digits other than 0 and 1,
*/


public class Set_8 {
	static boolean isBinary(String str) {
		int l = str.length();
		boolean b = false;
		int count = 0;
		for (int i = 0; i < l; i++) {
			if (str.charAt(i) == '0' || str.charAt(i) == '1')
				count++;
		    }
			if (count == l) {
				b = true;
			}
		return b;
	}

	public static void main(String[] args) {
		String s =new String("10110");
		System.out.println(isBinary(s));
	}
}
