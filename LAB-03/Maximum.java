/* Write a program to find maximum no from given 3 no.(without if-else) */

import java.util.Scanner;
public class Maximum
 {
 	public static void main ( String [] args )
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter A First Number: ");
 	 	double x = sc.nextDouble();

 	 	System.out.println("Enter A Secnod Number: ");
 	 	double y = sc.nextDouble();

 	 	System.out.println("Enter A Third Number: ");
 	 	double z = sc.nextDouble();

 	 	double MAX = ( x > y ) ? ( (x >z) ? +x : +z ) : ( ( y > z) ? +y : +z );

 	 	System.out.println("Maximum Number = " +MAX);
 	 }
 }


 //* */    ( ( a > b && a > c ) ? a : (  ( b > c ) ? b : c)  );