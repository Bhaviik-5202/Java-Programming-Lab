/* Write a program that creates and initializes a four integer element array. Calculate and 
display the average of its values. */

import java.util.Scanner;
public class Average {

	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Lenth Of Array: ");
		int Size = sc.nextInt();

		int Array [] = new int[Size];

		double Sum = 0;

		for (int i = 0; i <= Size-1; i++) {
			
			System.out.println("Enter A Number: ");
			int x = sc.nextInt();
			Sum = Sum + x;
		}

		double Avg = (Sum)/Size;

		System.out.println("Avg : " +Avg);

	}
}