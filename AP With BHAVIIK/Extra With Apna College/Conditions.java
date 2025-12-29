import java.util.Scanner;
public class Conditions 
 {
 	public static void main (String [] args)
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter First Number: ");
 	 	double a = sc.nextDouble();

 	 	System.out.println("Enter Second Number: ");
 	 	double b = sc.nextDouble();

 	 	System.out.println("Enter A Operator: ");
 	 	int Operator = sc.nextInt();

 	 	switch(Operator) 
 	 	{

 	 	 case 1: System.out.println("Sum = " +(a+b) );
 	 		break;

 	 	 case 2: System.out.println("Sub = " +(a-b) );
 	 		break;

 	 	 case 3: System.out.println("Multiple = " +(a*b) );
 	 		break;

 	 	 case 4:	if ( b == 0 ) {
 	 				System.out.println("Invalid Input");
 	 			 }

 	 			else {
 	 				System.out.println("Divide = " +(a+b) );
 	 			 }

 	 		break;

 	 	 case 5: if ( b == 0 ){
 	 				System.out.println("Invalid Input");
 	 			 }

 	 			else {
 	 				System.out.println("Modulo = " +(a+b) );
 	 			 }

 	 		break;
 	 		
 	 	 }

 	 }
 }