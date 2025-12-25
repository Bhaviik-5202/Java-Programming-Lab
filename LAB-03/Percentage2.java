import java.util.Scanner; // True Code...

public class Percentage2 
 {
 	public static void main ( String [] args )
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter 1 Subject Marks: ");
 	 	double a = sc.nextDouble();

 	 	System.out.println("Enter 2 Subject Marks: ");
 	 	double b = sc.nextDouble();

 	 	System.out.println("Enter 3 Subject Marks: ");
 	 	double c = sc.nextDouble();

 	 	System.out.println("Enter 4 Subject Marks: ");
 	 	double d = sc.nextDouble();

 	 	System.out.println("Enter 5 Subject Marks: ");
 	 	double e = sc.nextDouble();

 	 	if ( a >= 0.0 && b >= 0.0 && c >= 0.0 && d >= 0.0 && e >= 0.0 ) 
 	 	 {

 	 	 	double Per = (( a + b + c + d + e ) / 500.0) * 100;

 			System.out.println("Your Per. Is = " +Per);

  			if ( Per >= 60 )
 			{
 				System.out.println("Pass With First Class");
 			}

 			else if ( Per <= 59 && Per >= 50 ) 
 		 	{
 		 		System.out.println("Pass With Second Class");
 		 	}	

 			else if ( Per <= 49 && Per >= 40 ) 
 		 	{
 		 	System.out.println("Pass With Third Class");
 		 	}

 		 	else if ( Per < 40 && Per >0  ) 
 		 	{
 		 		System.out.println("Fail");
 		 	}
 		 	else 
 		 	 {
 		 	 	System.out.println("Sorry, Try Will be Next University & Pay Fee in A-107 & Thank You");
 		 	 }

 		 }
 	 	 
 		else 
 		 {
 		 	System.out.println("Please Enter Valid Marks");
 		 }
 	
 	 }
 }