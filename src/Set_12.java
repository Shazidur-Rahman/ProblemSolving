/*
Given an array A[] of N integers and an index Key.
Your task is to print the element present at index key in the array.
Example 1:

Input:
5 2
10 20 30 40 50
Output:
30

 */

public class Set_12 {
	static int findElementAtIndex(int a[], int n, int key){
		return a[key];
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int n = a.length;
		int key = 2;
		System.out.println(findElementAtIndex(a,n,key));
	}
}
