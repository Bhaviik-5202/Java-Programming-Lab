//! Scanner Line */

import java.util.Scanner;
public class SumOfTwoNum1 
 {
    public static void main ( String [] args) 
    {

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter A First Number:- ");
        double a = sc.nextDouble();

        System.out.println("Enter A Second Numbeer:- ");
        double b = sc.nextDouble();

        double Sum = a + b ;
        System.out.println("SUM = " + (Sum));
    
     }
 } 