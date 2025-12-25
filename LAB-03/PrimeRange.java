/* Write a program to print Prime Numbers between given range.  */

import java.util.Scanner; 
public class PrimeRange
 { 
    public static void main( String[] args ) 
     { 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range1:"); 
        int Range1 = sc.nextInt();

        System.out.print("Enter Range2:"); 
        int Range2 = sc.nextInt();

        PrimeRange Range = new PrimeRange();

        for ( int i = Range1; i <= Range2; i++) {
            Range.RangeFunction(i);
        }
     }

      boolean flag = false;
      public void RangeFunction( int num )
      { 

          for ( int i = 2; i <(num-1); i++ )
          { 

            if ( num % i == 0 ) {
               flag = true;
               break;
             }
             else {
               flag = false;
             }

          } 

          if (flag) 
          { 
            System.out.println("Not Prime = " +num); 
          }

          else 
          { 
           System.out.print("Prime Number = " +num);  
          } 

      } 
 }