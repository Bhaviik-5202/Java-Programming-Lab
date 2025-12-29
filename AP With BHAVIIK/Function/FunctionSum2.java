import java.util.Scanner; // Sum Of Two Number Second Method In Function....
public class FunctionSum2 
 {

	public static double SumOfTwo ( double x , double y ) 
	 { 
																	// public static (No...void) double SumOfTwo 
		double Sum = ( x + y );												//    |
		return Sum;															//	  |
																			// Data  Type.... //
	 }																	 	

	public static void main ( String [] args ) 
	 {

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A First Number: ");
		double x = sc.nextDouble();

		System.out.println("Enter A Second Number: ");
		double y = sc.nextDouble();

		double Sum = SumOfTwo( x , y ); // Call My Function Of Sum..... 

		System.out.println("Sum Of Two Number = " +Sum);

	 }

 }