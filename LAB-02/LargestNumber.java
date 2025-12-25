/*Write a program that prompts the user to enter three numbers. Find the largest 
number. */

import java.util.Scanner;
public class LargestNumber {
    public static void main ( String [] args )
     {

     	Scanner sc = new Scanner(System.in);

     	System.out.println("Enter A First Number: ");
     	double x = sc.nextDouble();

     	System.out.println("Enter A Second Number: ");
     	double y = sc.nextDouble();

     	System.out.println("Enter A Third Number: ");
     	double z = sc.nextDouble();

     	if ( x > y ) 
     	 {

     	 	if ( x > z ) 
     	 	 {
     	 		System.out.println("Largest Number: " +x);
     	 	 }
     	 	 else 
     	 	 {
     	 	 	System.out.println("Largest Number: " +z);
     	 	 }

     	}
     		
     	else if ( x < y ) 
     	  {

     	  	if ( y > z ) 
     	  	 {
     	  	 System.out.println("Largest Number: " + y);	
     	  	 }
     	  	 else 
     	  	 {
     	  	 	System.out.println("Largesr Number: " +z);
     	  	 }

     	  }

     	else 
     	  {
     	  	System.out.println("Invalid Input");
     	  }


     }
 }
