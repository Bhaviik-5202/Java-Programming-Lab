import java.util.Scanner;
public class Circle {
	public static void main (String [] args) 
	 {


		Scanner sc = new Scanner(System.in);

		//  Find Area & Parigh (Circumference)...&

		System.out.println("Enter A Radius Of Circle: ");
		double r = sc.nextDouble();

		final float PI = 3.14F; // Math.PI... // Online Search 

		double Area = PI * r * r; // Math.PI 
		System.out.println("Circle Of Area = " +Area);


		double Circumference = 2 * Math.PI * r;
		System.out.println("Circle Of Circumference = " +Circumference);


	}
}