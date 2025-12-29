/*
         *  
      * * *  
    * * * * *  
  * * * * * * *  
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */
import java.util.Scanner;
public class Diamond {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Uper Part..
		for (int i = 1; i <= 5; i++) {

			// For Upar Spaces...
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}

			// For Upar Star...
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}

		// For Lower Part
		for (int i = 5; i >= 1; i--) {

			// For Lower Spaces...
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}

			// For Lower Star...
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("* ");
			}

			System.out.println(" ");

		}
		sc.close();
	}
}