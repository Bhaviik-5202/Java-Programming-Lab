import java.util.Scanner;
public class Large
{
	public static void main ( String [] args )
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A First Number: ");
		double x = sc.nextDouble();

		System.out.print("Enter A Second Number:");
		double y = sc.nextDouble();

		if ( x > y ) 
		{
			System.out.print("Large Number: " + x);
		}
		else 
		{
			System.out.print("Large Number: " + y);
		} 
	}
}