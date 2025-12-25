import java.util.Scanner;
public class Rectangle 
 {
	public static void main ( String [] args ) 
	 {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Lenth:- ");
		double x = sc.nextDouble();

		System.out.print("Enter Width:- ");
		double y =  sc.nextDouble();

		if ( x > 0 && y > 0 ) 
		 {
			double Area = x * y;
			System.out.println("Area = " +Area);
		 }
		else if ( x < 0 ) 
		 {
		 	System.out.println(" Height Can't Not Neg.");
		 }
		else if ( y < 0 )
		 {
		 	System.out.println("Wight Can't Not Neg.");
		 } 
		else if ( x  < 0 && y < 0 )
		 {
		 	System.out.println("Height And Wight Can't Not Neg.");
		 }
		else 
		 {
		 	System.out.println("Invalid Input");
		 }

	 }
 }
