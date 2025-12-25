import java.util.Scanner;
public class Random {
	public static void main ( String [] args) 
	{

		Scanner sc = new Scanner(System.in);
		int MyNumber = (int)(Math.random()*100);
		int Usernum = 0;

		do 
		{
			System.out.println("Guess Any Number(1-100): ");
			Usernum = sc.nextInt();

			if ( Usernum == MyNumber ) {
				System.out.println("WOOHOO ... CORRECT Number");
				break;
			}
			else if ( Usernum > MyNumber ) {
				System.out.println("Your Number is too Large.....");

			}
			else {
				System.out.println("Your Number is Small.....");
			}

		} while(Usernum > 0);
	}
}