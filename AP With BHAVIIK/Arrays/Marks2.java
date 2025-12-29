import java.util.Scanner;
public class Marks2 {

	public static void main ( String args []) {

		Scanner sc = new Scanner (System.in);

		int Marks [] = new int[5];

		Marks[0] = 10;
		Marks[1] = 20;
		Marks[2] = 30;
		Marks[3] = 40;
		Marks[4] = 50;

		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Marks[] = " +Marks[i]);
		}
		

	}
}