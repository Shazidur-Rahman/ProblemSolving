/*
You a given a number N. You need to print the pattern for the given value of N.
for N = 2 the pattern will be
2 2 1 1
2 1
for N = 3 the pattern will be
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
*/

import java.awt.*;
import java.util.Scanner;

public class Set_1 {
	public static void printPat(int rows)
	{
		for (int i = rows; i > 0 ; i--){
			for (int j=rows; j > 0; j--){
				for (int k=1;k<=i;k++) {
					System.out.print(j +" ");
				}
			}
			System.out.print("$");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows = ");
		int rows = input.nextInt();
		printPat(rows);
	}

}
