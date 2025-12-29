import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Patten: ");

		for (int i = 1; i <= 5; i++) {
			// For Spacces...
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println("  ");
		}
		sc.close();
	}
}