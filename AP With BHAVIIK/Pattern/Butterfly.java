import java.util.Scanner;

public class Butterfly 
 {
	public static void main (  String [] args ) 
	 {

		Scanner sc = new Scanner(System.in);
		System.out.println("Patten: ");
		int n = 5;

		

		// First Upper Parts... //
		for ( int i = 1;  i <= n; i++) 
		 {
			for ( int j = 1; j <= i; j++ ) 
			{
				System.out.print("* ");
			}
		 

		 	// Spaces Print
			int spaces = 2 * ( n-i );
			for ( int j = 1; j <= spaces; j++ ) 
		 	{
		 	 System.out.print("  ");
		 	}

		  	// Second Upper Part
		  	for ( int j = 1; j <= i; j++ ) 
		 	{
		 		System.out.print("* ");	
		 	}

		 	  System.out.println("  ");
		 }



		// First Lower Part... //
		for ( int i = n;  i >= 1; i--) 
		 {
			for ( int j = 1; j <= i; j++ ) 
			{
				System.out.print("* ");
			}
		 

		 	// Spaces Print...
			int spaces = 2 * ( n-i );
			for ( int j = 1; j <= spaces; j++ ) 
		 	{
		 	 	System.out.print("  ");
		 	}

		  	// Second Lower Part...
		  	for ( int j = 1; j <= i; j++ ) 
		 	{
		 		System.out.print("* ");	
		 	}

		 	  	System.out.println("  ");
		}
		sc.close();
	 }
	
 }