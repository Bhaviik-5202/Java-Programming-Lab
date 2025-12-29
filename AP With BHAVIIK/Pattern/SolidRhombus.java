import java.util.Scanner;
public class SolidRhombus {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Patten: ");

		for (int i = 1; i <= 5; i++) {
			// Spaces Part
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}

			// Star Part
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}

			System.out.println("  ");

		}
		sc.close();
	}
}