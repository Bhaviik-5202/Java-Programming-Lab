import java.util.Scanner;
public class Two2DFindx
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

		 System.out.println("Enter Find (X) Find Number: ");
		 int x = sc.nextInt();

		// Output Loop...
		for ( int i = 0; i < Row; i++ ) 
		 {

			for ( int j = 0; j < Col; j++ ) 
			 {	

			 	if (Matrix[i][j] == x ) 
			 	 {
			 		System.out.println("Your (X) Number At Index: " +Matrix[i][j]+ "(" + i + ", " + j + ")");
			 	 }
			 	
			 }

		 }





	 }
}