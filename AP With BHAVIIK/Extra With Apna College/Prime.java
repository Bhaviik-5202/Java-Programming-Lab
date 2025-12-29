import java.util.Scanner;
public class Prime 
 {
 	int Prime(int Num) {
 		int Count = 0;
 		for (int i = 2 ; i <= Num; i++) 
 		 {
 			if ( Num % i == 0) 
 			 {
 				Count++;
 			 }

 		 }

 		if (Count == 2) {
 			System.out.print(Num+ " ");
 		}
 			return Num;
 	}
	public static void main( String[] args ) 
	 {	 
	 	 Prime P = new Prime(); 
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter  First Number: ");
		 int Num1 = sc.nextInt();

		 System.out.println("Enter Second Number: ");
		 int Num2 = sc.nextInt();

		 	for (int i = Num1; i <= Num2 ; i++) 
		 	 {
		 		P.Prime(i);
		 	 }

	 }
 }