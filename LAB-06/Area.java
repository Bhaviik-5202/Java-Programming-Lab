import java.util.Scanner;
class Circle 
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public void area() 
	{
		double area = 3.14 * this.radius * this.radius;
		System.out.println("Area : "+area);
	}
}

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius :");
		double radius = sc.nextDouble();
		
		Circle c1 = new Circle(radius);
		c1.area();
	}
}