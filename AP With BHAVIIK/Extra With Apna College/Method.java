public class Method {

	 static class Student {
		int id;
		String name;
		float sgpa;
		int schoolrship;

		public void printDetails() {
			System.out.println("My Name is :" + name);
			System.out.println("My ID is :" + id);
			System.out.println("My Marks :" + sgpa);
		}
		public int getschoolrship() {
			return 50000;
		}
	}
	public static void main(String[] args) {

		System.out.println("This is First Class Method");
		System.out.println();

		Student bhaviik = new Student();
		bhaviik.id = 1204;
		bhaviik.name = "BHAVIIK";
		bhaviik.sgpa = 9.9f;
		bhaviik.printDetails();

		System.out.println();

		Student devo = new Student();
		devo.id = 1206;
		devo.name ="Devanshu";
		devo.sgpa = 9.9f;
		devo.printDetails();
		
		System.out.println();

		int schoolrship = bhaviik.getschoolrship();
		System.out.println(schoolrship);
	}
}

// By Learning Code With Harry....