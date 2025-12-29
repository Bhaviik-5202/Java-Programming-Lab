import java.util.Scanner;

public class ZeroOne {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Patten");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {

				int Sum = (i + j);

				if (Sum % 2 == 0) {

					System.out.print("1 "); // Even

				}

				else {

					System.out.print("0 ");// Odd

				}

			}

			System.out.println("     ");

		}
		sc.close();
	}
}

/*
 * Dry Code:-
 * 
 * |-----------------------------|
 * | 1 | | | | | | |
 * | 0 | 1 | | | | | |
 * | 1 | 0 | 1 | | | | |
 * | 0 | 1 | 0 | 1 | | | |
 * | 1 | 0 | 1 | 0 | 1 | | |
 * | 0 | 1 | 0 | 1 | 0 | 1 | |
 * |-----------------------------|
 * 
 * (Sum) i + j = Even Number -> 1
 * (Sum) i + j = Odd Number -> 0
 * 
 */