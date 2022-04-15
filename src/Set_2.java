/*
You are given an array A of size N. You need to print elements of A in alternate order
(starting from index 0).

Example 1:
Input:
N = 4
A[] = {1, 2, 3, 4}
â€‹Output:
1 3
Example 2:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
â€‹Output:
1 3 5

* */

public class Set_2 {
	public static void print(int ar[], int n){
		for(int i = 0;i < n; i+=2){
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int n = 5;
		print(ar,n);
	}
}
