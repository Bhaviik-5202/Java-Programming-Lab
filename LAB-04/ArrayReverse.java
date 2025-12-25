//  Write a program to print given array in reverse order.

import java.util.Scanner;
public class ArrayReverse {
	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Lenth Of Array: ");
		int Size = sc.nextInt();

		int Array [] = new int[Size];

		for (int i = 0;  i <= Array.length-1; i++) {
			
			System.out.println("Enter A Number: ");
			Array[i] = sc.nextInt();

		}

		for (int i = (Array.length-1); i >= 0; i--) 
		{
			System.out.println("Reverse Array Number: " +Array[i]);
		}

	}
}
