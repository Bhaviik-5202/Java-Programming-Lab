/* Write a program to accept a line and check how many consonants and vowels are there 
in line. */
	
import java.util.Scanner;
public class LetterCount 
 {
	public static void main (String [] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Name: ");
		String str = sc.nextLine();

		int Consonants = 0;
		int Vowels = 0;

		for ( int i = 0; i < str.length(); i++) 
		{
			char C = str.charAt(i);

			 if ( C == 'A' || C =='E' || C == 'I' || C == 'O' || C == 'U' || 
			 	  C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u' ) 
			  {
			 	Vowels++;
			  }
			 else 
			 {
			 	Consonants++;
			 }
 
		}
			System.out.println("Vowels = " +Vowels);
			System.out.println("Consonants = " +Consonants);

	 }
 }