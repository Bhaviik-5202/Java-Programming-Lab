import java.util.Scanner;
public class Diamond {
    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array: ");
		int Size = sc.nextInt();


		int Diamond [] = new int [Size];
		
		for (int i = 1; i <= Size; i++) 
		 {
			
		 	// For Upar Spaces...
			for (int j = 1; j <= (Size-i); j++) 
			 {
				System.out.print("  ");		
			 }

			// For Upar Star...
			for (int j = 1; j <= ( 2*i - 1 ); j++)   // Logic = 2*i -1 
			 {
				System.out.print("* ");
			 }	
			 System.out.println(" ");

		 }

		 // For Lower Part
		 for (int i = Size; i >= 1; i--) 
		 {
			

		 	// For Lower Spaces...
			for (int j = 1; j <= (Size-i); j++) 
			 {
				System.out.print("  ");		
			 }

			// For Lower Star...
			for (int j = 1; j <= ( 2*i - 1 ); j++) 
			 {
				System.out.print("* ");
			 }	
			 System.out.println(" ");


		 }
    }
}
