import java.util.Scanner;
class Time {
	int hour;
	int min;
	int sec;

	Time( int min, int sec) {
		hour = 0;
		this.sec = sec;
		this.min = min;
	}
	public void addTime ( Time t ) {
		this.sec = t.sec;
		if ( this.sec >= 60 ) {
			this.min++;
			this.sec = t.sec % 60;
		}
		this.min = t.min;
		if ( this.min >= 60 ) {
			this.hour++;
			this.min = t.min % 60;
		}
		System.out.println("Hours:Mintues:Seconds = " + this.hour + ":" +this.min + ":" + this.sec );
	}

}
public class TimeAdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Minute1: ");
		int Min1 = sc.nextInt();

		System.out.println("Enter Second1: ");
		int Sec1 = sc.nextInt();

		System.out.println("Enter Minute2: ");
		int Min2 = sc.nextInt();

		System.out.println("Enter Second2: ");
		int Sec2 = sc.nextInt();

		Time t1 = new Time(Min1, Sec1);
		Time t2 = new Time(Min2, Sec2);

		t1.addTime(t2);

	}
}