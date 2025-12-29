import java.util.Scanner;
public class Floyd
 {
	public static void main( String[] args) 
	 {

		Scanner sc = new Scanner(System.in);
		System.out.println("Patten:- ");

		int num = 1; // Try int num = 0;

		for (int i = 0; i <= 4; i++) 
		 {
			for (int j = 0; j <= i; j++) 
			 {

				System.out.print(" " +num);
				num++;

			 }
			
			System.out.println("  ");
		
		 }
		 sc.close();
	 }
 }