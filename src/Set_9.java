/*
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0
*/

public class Set_9 {
	public static int palinArray(int[] arr, int n) {
		int count=0;
		for (int i = 0; i<n; i++) {
			int b = arr[i];
			int temp = b;
			int r=0,sum=0;
			while (b > 0){
				r = b % 10;
				sum = (sum * 10) + r;
				b = b / 10;
			}
			if (temp == sum){
				count++;
			}
		}
		if (count == n){
			return 1;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] arr = {111, 222,232,444};
		int n = 4;
		System.out.println(palinArray(arr,n));


	}
}
