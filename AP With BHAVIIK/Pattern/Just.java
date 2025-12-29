import java.util.Scanner;

public class Just {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Patten");

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == 0 || j == 0 || i == 5 || j == 5 || i == 2 || j == 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println("");

		}
		sc.close();
	}
}