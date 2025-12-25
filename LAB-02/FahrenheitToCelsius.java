/* Write a program to convert temperature from Fahrenheit to Celsius. (Formula :
 C = (F-32) * 5/9 ); */

import java.util.Scanner;
public class FahrenheitToCelsius 
 {
    public static void main ( String [] args )
     {

     	Scanner sc = new Scanner(System.in);

     	System.out.println("Enter A Fahrenheit: ");
     	double F = sc.nextDouble();

     	// Convert To Celsius...
     	double C = (F - 32) * 5/9;
     	System.out.println(+F+ "= (Fahrenheit) "  +C+ " = (Celsius)");


     /*
     	System.out.println("Enter A Celsius: ");
     	double C = sc.nextDouble();

     	// Convert To Fahrenhit
     	double F = C * (9/5) + 32;
      	System.out.println(+C+ "= Celsius" +F+ "= Fahrenheit");
     */
     }
 }
