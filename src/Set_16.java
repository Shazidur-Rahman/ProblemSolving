/*
Given a sorted array A of size N. Find number of elements which are less than
or equal to given element X.
Example 1:

Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
Example 2:

Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4
 */

import java.util.Arrays;

public class Set_16 {
	public static int countOfElements(int arr[], int n, int x){
		Arrays.sort(arr);
		int count = 0;
		int i = 0;
		while (arr[i] != x){
			count++;
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		int n= 7;
		int arr[] = {1, 2, 2, 2, 5, 7, 9};
		int x = 2;
		System.out.println(countOfElements(arr,n,x));
	}
}
