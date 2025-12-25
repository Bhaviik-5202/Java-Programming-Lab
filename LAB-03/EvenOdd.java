/* Write a program to check whether a number is even or odd. */

import java.util.Scanner;
public class EvenOdd 
 {
 	public static void main ( String [] args )
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter A Number: ");
 	 	double x = sc.nextDouble();

 	 	if ( x % 2 == 0)
 	 	 {
 	 	 	System.out.println("Even Number = " +x);
 	 	 }

 	 	else 
 	 	 {
 	 	 	System.out.println("Odd Number = " +x);
 	 	 }

 	 
 	 }
 }