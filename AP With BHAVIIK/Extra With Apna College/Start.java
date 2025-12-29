public class Start {
	public static void main(String[] args) {
		

		Person P1 = new Person();
		Person P2 = new Person();
		Person P3 = new Person();

		P1.name = "BHAVIIK";
		P1.age = 18;

		P2.name = "Devanshu";
		P2.age = 20;

		P3.name = "Aryan";
		P3.age = 18;

		P1.displayName();
		P2.displayName();
		P3.displayName();

		P1.displayage();
		P2.displayage();
		P3.displayage();

	}
}

class Person {
	String name;
	int age;

	public void displayName() {
		System.out.println("Name: "+ name);
	}

	public void displayage() {
		System.out.println("Age: " +age);
	}
}