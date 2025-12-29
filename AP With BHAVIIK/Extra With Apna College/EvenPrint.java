import java.util.Scanner; // 
public class EvenPrint 
 {
 	public static void main (String [] args) 
 	 {

 	 	Scanner sc = new Scanner(System.in);

 	 	System.out.println("Enter Number OF Start: ");
 	 	double Start = sc.nextDouble();

 	 	System.out.println("Enter Number OF End: ");
 	 	double End = sc.nextDouble();


 	 	System.out.println("Even Numbers Between " + Start + " AND " + End + ":");

 	 	for (double i = Start; i <= End; i++) 
 	 	 {
 	 		if (i % 2 == 0) {
 	 			System.out.println(	i);
 	 		 }
 	 	 }
 	 }
 }



 /* Output:
 	Enter Number OF Start:
	10
	Enter Number OF End:
	20
	Even Numbers Between 10.0 AND 20.0:
	10.0
	12.0
	14.0
	16.0
	18.0
	20.0
  */

  /*
   * import java.util.Scanner;
   * public class EvenPrint 
   *  {
   * 	 public static void main (String [] args) 
   *     {
   *		Scanner sc = new Scanner(System.in);
   * 
   * 		double x = 25;
   * 		for( int i = 1; i <= x; i++) {
   * 
   * 			if (i % 2 == 0) {
   * 				System.out.println(i);
   * 			}
   * 
   * 		}
   * 
   * 	 }
   *  }
   * 	
   * 
   
   */
  	