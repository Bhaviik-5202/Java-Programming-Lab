import java.util.Scanner;
public class Month 
 {

 	public static void main (String [] args) 
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter Number(1-12): ");
 	 	int x = sc.nextInt();


 	 	if ( x > 0  && x <= 12 ) 
 	 	 {
 	 		if ( x == 1 ) 
 	 		 {
 	 			System.out.println("1. January ");
 	 		 }

 	 		else if ( x == 2 ) 
 	 		 {
 	 			System.out.println("2. February ");
 	 		 }

 	 		else if ( x == 3 ) 
 	 		 {
 	 			System.out.println("3. March ");
 	 		 }

 	 		 else if ( x == 4 ) 
 	 		 {
 	 			System.out.println("4. April ");
 	 		 }

 	 		 else if ( x == 5 ) 
 	 		 {
 	 			System.out.println("5. May ");
 	 		 }

 	 		 else if ( x == 6 ) 
 	 		 {
 	 			System.out.println("6. June ");
 	 		 }

 	 		 else if ( x == 7 ) 
 	 		 {
 	 			System.out.println("7. July ");
 	 		 } 

 	 		 else if ( x == 8 ) 
 	 		 {
 	 			System.out.println("8. August ");
 	 		 } 

 	 		 else if ( x == 9 ) 
 	 		 {
 	 			System.out.println("9. September ");
 	 		 }

 	 		 else if ( x == 10 ) 
 	 		 {
 	 			System.out.println("10. October ");
 	 		 }

 	 		 else if ( x == 11 ) 
 	 		 {
 	 			System.out.println("11. November ");
 	 		 }

 	 		else if ( x == 12 ) 
 	 		 {
 	 			System.out.println("12. December ");
 	 		 }

 	 		else 
 	 		 {
 	 		  	System.out.println("Please, Enter Valid Input");
 	 		 }

 	 	 }

 	 	 else 
 	 	  {
 	 	  	System.out.println("Plese, Valid Input, & +ve Number, & Enter (1-12) Between Number...");
 	 	  }
 	 	
 	 }
 }