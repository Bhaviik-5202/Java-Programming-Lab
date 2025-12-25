/* Write a program to check that the given number is prime or not. */

import java.util.Scanner; 
public class Prime 
 { 
    public static void main( String[] args ) 
     {  

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter A Number: ");
        int n = sc.nextInt(); 
        boolean flag = false;


         for( int i=2 ; i < (n-1) ; i++ )
          { 
            if ( n % i ==  0 )
             { 

               flag = true; 
               break;

            }

            else
             { 
                flag = false; 
             } 

          }

         if ( flag )
          { 
            System.out.println("Not Prime: " +n); 
          }

         else 
          { 
            System.out.println("Prime: " +n); 
          } 


     } 
 } 