public class GetSet {

	static class MyStudent {

		private int id;
		private String name;

		public void setid( int i ) {
			this.id = i;
		}
		public int getid() {
			return id;
		}
		public void setname( String  n ) {
			this.name = n;
		}
		public String getname () {
			return name;
		}

	}
	public static void main(String[] args) {

		System.out.println("This is A Get & Set Method");
		System.out.println();

		MyStudent BHAVIIK = new MyStudent();

		BHAVIIK.setid(1204);
		System.out.println(BHAVIIK.getid());

		BHAVIIK.setname("Bhaviiik");
		System.out.println(BHAVIIK.getname());

	}
}