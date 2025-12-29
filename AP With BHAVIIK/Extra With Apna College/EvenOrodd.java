import java.util.Scanner; // Logical Question....
public class EvenOrodd 
{

	public static void main ( String [] args ) 
	{
 
 	 Scanner sc = new Scanner(System.in);

 	 System.out.print("Enter First Number : ");
 	 int x = sc.nextInt();

	 System.out.print("Enter First Number : ");
 	 int y = sc.nextInt();


						
	if ( x % 2 == 0 && y % 2 == 0) {
			System.out.println("Both Number is Even");
		}

	else if ( x % 2 != 0 && y % 2 != 0) {									 
		System.out.println("Both Number is Odd");
		}

	else {
		System.out.println("One Number is Even and One Number is Odd");
		}

	}
}