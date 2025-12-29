import java.util.Scanner;
public class EvenOdd 
{
	public static void main ( String [] args )
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter A Number: ");
		int a = sc.nextInt();

		if ( a % 2 == 0 ) {
			System.out.print("Number Is EVEN");
		}
		else {
			System.out.print("Numner Is ODD");
		}

	}
}