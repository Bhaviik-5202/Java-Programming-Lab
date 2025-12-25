import java.util.Scanner;
public class MeterToFeet 
 {
 	public static void main ( String [] args)
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter A Meter:- ");
 	 	double M = sc.nextDouble();

 	 	double  F= M * 3.28;

 	 	System.out.println("(Meter) = " +M+  " (Foot) = " +F );
 	 	 
 	 }
 }