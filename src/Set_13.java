/*
Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
Example 1:
Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.

Example 2:
Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 1
+ 2 + 3 + 4 + 5 = 15.
 */

public class Set_13 {
	static int seriesSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n ; i++) {
			sum = sum + i ;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(seriesSum(5));
	}
}
