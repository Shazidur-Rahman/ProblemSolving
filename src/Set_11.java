import java.util.Scanner;
import java.util.*;
/*
Given a number N. The task is to complete the function convertFive()
which replace all zeros in the number with 5 and returns the number.
Example:
Input
2
1004
121
Output
1554
121
 */
public class Set_11 {
	public static int convertFive(int n){
		//add code here.
		String str = String.valueOf(n);
		return Integer.parseInt(str.replaceAll("0", "5"));
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		System.out.println(convertFive(num));


	}
}
