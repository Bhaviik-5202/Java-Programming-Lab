/* 
 * Declare a class called Student having following data members:id_no, 
 * no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi.
 * Define constructor and calculate_spi methods. Define main to instantiate an array for 
 * objects of class student to process data of n students to be given as command line
 * arguments. 
 */
import java.util.Scanner;
class Student {
	int id_no;
	int no_of_sub;
	String [] sub_code;
	int [] sub_credit;
	String [] grade_obtained;
	double spi;

	Student ( int id_no, int no_of_sub, String [] sub_code, int [] sub_credit, String [] grade_obtained ) {
		this.id_no = id_no;
		this.no_of_sub = no_of_sub;
		this.sub_code = sub_code;
		this.sub_credit = sub_credit;
		this.grade_obtained = grade_obtained;
	}

	public int grade_point ( String g ) {
		if ( g.equals("A")) {
			return 10;
		}
		else if ( g.equals("B")) {
			return 9;
		}
		else if ( g.equals("C")) {
			return 8;
		}
		else if ( g.equals("D")) {
			return 7;
		}
		else if ( g.equals("E")) {
			return 6;
		}
		return 0;
	}

		public void count_SPI() {
			int total_point = 0;
			int total_credit = 0;

			for (int i = 0; i < no_of_sub; i++ ) {
				total_credit += sub_credit[i];
				total_point += sub_credit[i] * grade_point(grade_obtained[i]);
			}

			double spi = (total_point / total_credit);

		}	
} 
public class StudentSPI {
	public static void main( String [] args ) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID No: ");
		int id_no = sc.nextInt();

		System.out.println("Enter No Of Subject: ");
		int no_of_sub = sc.nextInt();

		for (int i = 0; i < no_of_sub; i++) {
			System.out.println("Enter Subject "+(i+1) +"Marks: ");
			no_of_sub [] = sc.next().char(0);
		}
		
		System.out.println("Enter Subject Code: ");
		String sub_code = sc.nextLine();

		System.out.println("Enter Subject Credit: ");
		int sub_credit = sc.nextInt();

		System.out.println("Enter Subect Grade: ");
		String grade_obtained = sc.nextLine();
 		
 		Student s1 = new Student(id_no, no_of_sub, sub_code, sub_credit, grade_obtained);
 		s1.spi();

		System.out.println("Final SPI: " +spi);

 	}
}
