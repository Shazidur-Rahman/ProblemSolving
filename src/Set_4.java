/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to
that of its index value ( Consider 1-based indexing ).
Example 1:
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
ex2:
Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
 */

import java.util.ArrayList;

public class Set_4 {
	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i=0; i<n; i++ ){
			if (arr[i]==(i+1)){
				list.add(i+1);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {10, 2, 4, 74, 33};
		int n = 5;
		System.out.println(valueEqualToIndex(arr,n));
	}
}