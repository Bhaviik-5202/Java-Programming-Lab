import java.util.Scanner;
public class Choise 
 {
 	public static void main (String [] args) 
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter First Number: ");
 	 	double x = sc.nextDouble();

 	 	System.out.println("Enter First Number: ");
 	 	double y = sc.nextDouble();

 	 	System.out.println("Enter Your Choise(ASMDR): ");
 	 	String c = sc.next();


 	 	if (  c.equals("A") || c.equals("a")  )  
 	 	 {
 	 		System.out.println("Sum Of Number: " +(x + y) );
 	 	 }

 	 	else if ( c.equals("S") || c.equals("s") ) 
 	 	 {
 	 		System.out.println("Sub: " +(x - y) );
 	 	 }

 	 	else if ( c.equals("M") || c.equals("m") ) 
 	 	 {
 	 		System.out.println("Multiple: " +(x * y) );
 	 	 }

 	 	else if ( c.equals("D") || c.equals("d") ) 
 	 	 {
 	 		System.out.println("Divide: " +(x / y) );
 	 	 }

 	 	 else if ( c.equals("R") || c.equals("r") ) 
 	 	 {
 	 		System.out.println("Modulo: " +(x % y) );
 	 	 }
 	 	 
 	 	else {
 	 		System.out.println("Invalid Input");
 	 	}

 	 }
 }