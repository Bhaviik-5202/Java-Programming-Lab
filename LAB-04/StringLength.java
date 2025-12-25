// Write a program to find length of string and print second half of the string.

import java.util.Scanner;
public class StringLength 
 {
	public static void main ( String [] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A String: ");
		String str = sc.nextLine();

		System.out.println("String OF Length: " +str.length());
		System.out.println("Half String: "  +(str.length()/2));


		for (int i = str.length()/2; i <= str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
 }

 // String Ma () Aave Chhe And Arrays Ma () Nathi Aavto...