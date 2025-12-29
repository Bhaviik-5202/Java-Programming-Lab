import java.util.Scanner;
public class FindX
 {
	public static void main ( String [] args) 
	 {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Array: ");
		int Size = sc.nextInt();


		int FindIndex [] = new int [Size];
		
		// Input Loop.....
		for (int i = 0; i < Size; i++) 
		{
			System.out.print(" Enter Any Number = ");
			FindIndex[i] = sc.nextInt();	
		}


		System.out.println("Enter Which (X) Find Number: ");
		int x = sc.nextInt();

		// Output Loop.....
		for (int i = 0; i < FindIndex.length; i++) 
		{
			
			if ( FindIndex[i] == x) 
			{
				System.out.println("Your Number (X) At Index = " +i);
			}
		}


	 }
 }