import java.util.Scanner;

public class Letter 
 {
 	public static void main ( String[] args)
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter A Letter:- ");
 	 	String s = sc.next();

 	 	if ( s.equals("A")|| s.equals("I") || s.equals("O") || s.equals("U") || s.equals("E") ||
 	 		 s.equals("a") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("e")  
 	 		) 
 	 	 {
 	 	 	System.out.println("Vowel Letter = " +s);
 	 	 }
 	 	else 
 	 	 {
 	 	 	System.out.println("Consonant Letter = " +s);
 	 	 }

 	 }
 }