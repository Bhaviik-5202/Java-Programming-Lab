import java.util.Scanner;
public class ASMD 
 {
	public static void main ( String [] args) 
	 {
		 Scanner scanner = new Scanner(System.in);

		 System.out.print("Enter A First Int:- ");
		 int x = scanner.nextInt();

		 System.out.print("Enter A Second Int:- ");
		 int y = scanner.nextInt();

		 System.out.print("Enter Your Choise (ASMD) :- ");
		 String s = scanner.next();

		 if ( s.equals("A") || s.equals("a") ) 
		 {
			 System.out.print("Add = " + (x + y));
		 }

		 else if ( s.equals("S") || s.equals("s")  ) 
		 {
			 System.out.print("Sub = " + ( x - y ));
		 }

		 else if ( s.equals("M") || s.equals("m")  )
		 {
			 System.out.print("Multiple = " + ( x * y ));
		 }

		 else if ( s.equals("D") || s.equals("d") ) 
		 {
			 System.out.print("Divide = " + ( x / y ));
		 }

		 else
		 {
			 System.out.print("Invalid Input");
		 }

	 } 

 }