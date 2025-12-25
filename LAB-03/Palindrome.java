/* Write a program to find that given number is palindrome or not. */ 

import java.util.Scanner;
public class Palindrome 
 {
 	public static void main ( String [] args)
 	 {

 	 	Scanner sc = new Scanner( System.in);

 	 	System.out.println("Enter A Number: ");
 	 	int palindrome = sc.nextInt();

        int Original = palindrome; 
        int rev = 0;
        int r; 
        while ( Original > 0 )
         { 

            r = Original % 10; 
            rev = (rev * 10 ) + r; 
            Original = Original / 10; 

     	 }

        if ( Original == rev ) 
         { 
            System.out.println("Number Is Palindrome = " +palindrome);
         }

        else 
         { 
            System.out.println("Number Is Not Palindrome = " +palindrome); 
         }       
     } 

 } 