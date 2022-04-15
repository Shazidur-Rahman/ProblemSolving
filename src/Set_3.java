/*
* Print numbers from 1 to N without the help of loops.
Example 1:
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
*/

import java.util.Scanner;

public class Set_3 {
	public static void printNos(int N)
	{
		if(N==0){
			return;
		}
		printNos(N-1);
		System.out.print(N +" ");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input = ");
		int N = input.nextInt();
		printNos(N);
	}
}
