import java.util.Scanner; // Sum Of Two Number First Method In Function....

public class FunctionSum {


	public static void SumOfTwo ( double Sum ) {
		System.out.println("Sum = " +Sum );
		return;
	}

	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A First Number: ");
		double x = sc.nextDouble();

		System.out.println("Enter A Second Number: ");
		double y = sc.nextDouble();

		double Sum = (x + y);
		SumOfTwo(Sum); // Call My Function....

	}
}