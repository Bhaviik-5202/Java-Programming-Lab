import java.util.Scanner;
public class Marks4 
 {
	public static void main ( String [] args) 
	 {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Array: ");
		int Size = sc.nextInt();


		int Marks[] = new int[Size];
		
		// Input Loop...
		for (int i = 0; i < Size; i++) 
		{

			System.out.print(" Enter Your Marks[] = ");
			Marks[i] = sc.nextInt();
			
		}

		// Output Loop...
		for (int i = 0; i < Size ; i++) 
		{
			System.out.println(" Marks[] = " +Marks[i]);
		}


	 }
 }