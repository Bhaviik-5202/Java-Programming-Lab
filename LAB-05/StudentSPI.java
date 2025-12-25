class Student {
	int id_no;
	int no_of_sub;
	String [] sub_code;
	int [] sub_credit;
	char [] grade_obtained;
	double spi;

	Student ( int id_no, int no_of_sub, String [] sub_code, int [] sub_credit, char [] grade_obtained ) {
		this.id_no = id_no;
		this.no_of_sub = no_of_sub;
		this.sub_code = sub_code;
		this.sub_credit = sub_credit;
		this.grade_obtained = grade_obtained;

	public int grade_point ( String g ) {
		if ( g.equals("A")) {
			return 10;
		}
		else if ( g.equals("B")) {
			return 8;
		}
		else if ( g.equals("C")) {
			return 6;
		}
		else if ( g.equals("D")) {
			return 4;
		}
		else if ( g.equals("E")) {
			return 2;
		}
	}

		public void SPI() {
			int total_point = 0;
			int total_credit = 0;

			for (int i = 0; i < no_of_sub; i++ ) {
				total_credit += sub_credit[i];
				total_point += sub_credit[i] * grade_point(grade(i));
			}
		}
} 


public class StudentSPI {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.spi();
	}
}