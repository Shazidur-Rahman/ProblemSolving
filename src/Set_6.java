import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given an array arr[] of N integers, calculate the median
Example 1:
Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array
middle element is the median
Example 2:
Input: N = 4
arr[] = 56 67 30 79
Output: 61
Explanation: In case of even number of
elements, average of two middle elements
is the median.
*/
public class Set_6 {
	public static int find_median(int[] v)
	{
		int median = 0;
		int half = 0;
		Arrays.sort(v);
		if(v.length==1){
			median=v[0];
		}
		else if(v.length%2==0){
			half = v.length/2;
			median = (v[half]  + v[half-1])/2;
		}
		else{
			half = v.length/2;
			median = v[half];
		}
		return median;
	}

	public static void main(String[] args) {
		int[] v = {90,100,78,89,67};
		int[] b = {56,67,30,79};
		System.out.println(find_median(b));
		System.out.println(find_median(v));
	}
}
