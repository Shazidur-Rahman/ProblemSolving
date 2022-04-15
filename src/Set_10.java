/*
Given an integer array Arr[] of size N. The task is to find sum of it.

		Example 1:

		Input:
		N = 4
		Arr[] = {1, 2, 3, 4}
		Output: 10
		Explanation: 1 + 2 + 3 + 4 = 10.
*/
public class Set_10 {
	static int sum(int arr[], int n) {
		int s = 0;
		for (int i = 0; i < n ; i++) {
			s = s + arr[i];
		}
		return s;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int n = 4;
		System.out.println(sum(arr,n));
	}
}
