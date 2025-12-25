/* Write a program to check whether a year is leap year or not. */

import java.util.Scanner;
 public class LeapYear 
 {
 	public static void main ( String [] args )
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter A Year: ");
 	 	double Year = sc.nextDouble();


 	 	if ( (( Year % 4 == 0 ) && ( Year % 100 != 0)) || ( Year % 400 == 0))
 	 	 {

 	 	 	System.out.println("This Year Is Leap Year = " +Year);

 	 	 }

 	 	 else 
 	 	 {

 	 	 	System.out.println("This Year Is Not Leap Year = " +Year);

 	 	 }

 	 }


 }