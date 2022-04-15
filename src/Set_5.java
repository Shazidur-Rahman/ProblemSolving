/*Given an array of N integers. Your task is to print the sum of all of the integers.

Example 1:
Input:
4
{1 2 3 4}
Output:
10
*/
public class Set_5 {
	public static int getSum(int a[], int n)
	{
		int sum=0;
		for (int i=0;i<n;i++){
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a ={1,2,3,4};
		int n=4;
		System.out.println(getSum(a,n));
	}
}