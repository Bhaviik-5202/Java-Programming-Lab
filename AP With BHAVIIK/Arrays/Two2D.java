import java.util.Scanner;
public class Two2D 
 {
	public static void main ( String [] args ) 
	 {

		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter Of Rows Size: ");
		int Row = sc.nextInt();

		System.out.println("Enter Of Column Size: ");
		int Col = sc.nextInt();

		int [] [] Matrix = new int [Row][Col];


		// Input Loop....
		for ( int i = 0; i < Row; i++ ) 
		 {

			for ( int j = 0; j < Col; j++ ) 
			 {	
			 	Matrix[i][j] = sc.nextInt();
			 }	

			 System.out.println("  ");
		 }

		 System.out.println("Your Matrix Form: ");

		// Output Loop...
		for ( int i = 0; i < Row; i++ ) 
		 {

			for ( int j = 0; j < Col; j++ ) 
			 {	

			 	System.out.print(Matrix[i][j] +" ");

			 }	

			 System.out.println("  ");

		 }





	 }
}