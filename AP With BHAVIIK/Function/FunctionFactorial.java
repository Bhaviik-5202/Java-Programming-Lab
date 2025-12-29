import java.util.Scanner;

public class  FunctionFactorial {

	public static void PrintFactorial ( int n ) {
		int Factorial = 1;

		if (n < 0 ) {
			System.out.println("Invalid Input");
			return;
		}
		for (int i = n; i >= 1; i-- ) 
		 {
			Factorial = Factorial * i;
		 }

		System.out.println("Factorial OF Number = " +Factorial);
		return; 
				// Uper Faction Ma Void Chhe To  return Ni Jarur  Nathi.... 
				// return Hoy To Pn Chale..... 
	}

	public static void main ( String [] args ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number: ");
		int n = sc.nextInt();

		PrintFactorial(n); // Call My Function Of Factorial.....

	}
}


/* 
 	Factorial:- => n! = n * (n-1) * (n-2) * (n-3) * ..... * 1;
 
 	-ve Number Factorial Possiable Nathi...

 	0! = 1;
 	1! = 1;
 	2! = 2 * 1 = 2;
 	3! = 3 * 2 *1 = 6;
 	4! = 4 * 3 * 2 * 1  = 24;

*/