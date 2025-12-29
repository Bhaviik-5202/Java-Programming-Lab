import java.util.Scanner;  // Multiple (Product) Of Two Number First Method....
public class FunctionMultiple {

	public static double MultipleOfTwo ( double x , double y ) {
		double Multiple = x * y ;
		return(Multiple);
	}

	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A First Number: ");
		double x = sc.nextDouble();

		System.out.println("Enter A Second Number: ");
		double y = sc.nextDouble();

		double Multiple = MultipleOfTwo( x , y);
		System.out.println("Multiple Of Two Number =  " +Multiple);

	}
}