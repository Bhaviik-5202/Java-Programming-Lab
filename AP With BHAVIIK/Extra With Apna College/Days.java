import java.util.Scanner;
public class Days
 {

 	public static void main (String [] args) 
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter Number(1-7): ");
 	 	int x = sc.nextInt();


 	 	if ( x > 0  && x <= 7 ) 
 	 	 {
 	 		if ( x == 1 ) 
 	 		 {
 	 			System.out.println("1. Monday ");
 	 		 }

 	 		else if ( x == 2 ) 
 	 		 {
 	 			System.out.println("2. Tuesday ");
 	 		 }

 	 		else if ( x == 3 ) 
 	 		 {
 	 			System.out.println("3. Wednesday ");
 	 		 }

 	 		 else if ( x == 4 ) 
 	 		 {
 	 			System.out.println("4. Thursday ");
 	 		 }

 	 		 else if ( x == 5 ) 
 	 		 {
 	 			System.out.println("5. Friday ");
 	 		 }

 	 		 else if ( x == 6 ) 
 	 		 {
 	 			System.out.println("6. Saturday ");
 	 		 }

 	 		 else if ( x == 7 ) 
 	 		 {
 	 			System.out.println("7. Sunday ");
 	 		 }

 	 		else 
 	 		 {
 	 		  	System.out.println("Please, Enter Valid Input");
 	 		 }

 	 	 }

 	 	 else 
 	 	  {
 	 	  	System.out.println("Plese, Valid Input, & +ve Number, & Enter (1-7) Between Number...");
 	 	  }
 	 	
 	 }
 }
