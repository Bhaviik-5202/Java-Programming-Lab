import java.util.Scanner;
public class TargectPivot  {
	public static void main ( String [] args )
	 {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Array: ");
		int Size = sc.nextInt();

		int [] Array = new int [Size];

		for (int i = 0; i < Size; i++) 
		{	
			System.out.print("Enter A Element With Ascending Order: ");
			Array [i] = sc.nextInt();
		}

			System.out.println("Original Array: ");
		for (int i = 0; i < Size; i++) 
		{
			System.out.print(" " +Array[i]+ " ");
		}
			System.out.println("");

		int [] Pivot = new int [Size];

		System.out.println("Enter Pivot Of Index: ");
		int P = sc.nextInt(); 

		int [] Result = new int [Size];

		// Result the array at pivot index P
		for (int i = 0; i < Size; i++) 
		{
			Result[i] = Array[(i + P) % Size]; //! Logic.... 
		}
		
		System.out.println("Result Array: ");
		for (int i = 0; i < Size; i++) 
		{
			System.out.print(" " + Result[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Enter Target Element: ");
		int Target = sc.nextInt();

		int Index = -1;
		for (int  i = 0; i < Result.length; i++) 
		{
			if(Target == Result[i])  
			{
				Index = i;
				break;
			}
		}
		if(Index != -1 ) {
			System.out.print("Target Element: " +Index);
		}
		else {
			System.out.print("Target Element Not Found = -1");
		}

	 }
 }
