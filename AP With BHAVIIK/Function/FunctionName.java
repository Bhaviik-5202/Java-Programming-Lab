import java.util.Scanner;
public class FunctionName 
 {

	public static void PrintMyName ( String name ) 
	{
		System.out.println("Your Name = " +name );
		return;
	}

  	public static void main ( String [] args )
  	{
  	 	Scanner sc = new Scanner(System.in);

  	 	System.out.println("Enter Your Name: ");
  	 	String name = sc.next();

  	 	PrintMyName(name); // Call My Function...

  	}


 }