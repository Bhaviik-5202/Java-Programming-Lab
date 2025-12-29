import java.util.Scanner; // Multiple (Product) Of Two Number Second Method....
public class FunctionMultiple2 {

	public static double MultipleOfTwo ( double x , double y ) {
		return( x * y );
	}

	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A First Number: ");
		double x = sc.nextDouble();

		System.out.println("Enter A Second Number: ");
		double y = sc.nextDouble();

		
		System.out.println("Multiple Of Two Number =  " +MultipleOfTwo( x, y ) );

	}
}