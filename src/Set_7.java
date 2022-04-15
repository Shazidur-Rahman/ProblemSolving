import java.util.Arrays;

/*
Given an array Arr of size N, print second largest element from an array.
Example 1:
Input:
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the
array is 35 and the second largest element
is 34.
Example 2:
Input:
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of
the array is 10 and the second
largest element is 5.
{1,2,3,3,4}
*/
public class Set_7 {
	public static int print2largest(int arr[], int n) {
		Arrays.sort(arr);
		int large = arr[n-1];
		for (int i = n-1; i > 0; i--){
			if (large > arr[i-1]){
				 return arr[i-1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int n = 6;
		System.out.println(print2largest(arr,n));
	}
}
