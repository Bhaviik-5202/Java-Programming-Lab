import java.util.Scanner;
public class Avg 
{

	public static void main ( String [] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		double x = sc.nextDouble();

		System.out.print("Enter Second Number: ");
	 	double y = sc.nextDouble();

		System.out.print("Enter Third Number: ");
		double z = sc.nextDouble();

		double Avg = ( x + y + z ) / 3 ;
		System.out.print("Avg Of 3 Number: " + Avg );

	}

}