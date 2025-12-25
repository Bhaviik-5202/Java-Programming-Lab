/*
	Declare a class called book having author_name as private data member. Extend book 
	class to have two sub classes called book_publication & paper_publication. Each of 
	these classes have private member called title. Write a complete program to show 
	usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
	publications of given author.Use command line arguments for input data.
*/

import java.util.Scanner;
class Book {

	private String author_name;
	Book( String author_name) {
		this.author_name = author_name;
	}
		void display() {
			System.out.println("Author Name: "+author_name);
		}

	class Book_Publication extends Book {
			private String title;
			Book_Publication ( String author_name, String title) {
				super(author_name);
				this.title = title;	
			}
			void display() {
				super.display();
				System.out.println("Book_Publication Title: " + this.title);
			}
	}

	class Paper_Publication extends Book {
			private String title;
			Paper_Publication (String author_name, String title) {
				super(author_name);
				this.title = title;	
			}
			void display() {
				super.display();
				System.out.println("Book_Publication Title: " + this.title);
			}
	}

}
public class Book_Pub {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book b;
		System.out.println("Enter 1.Book_Publication: ");
		System.out.println("Enter 2. Paper_Publication: ");
		int x = sc.nextInt();


		if ( x == 1) {
			b = new Book_Publication(args[0], args[1]);
		}
		else if ( x == 2) {
			b = new Paper_Publication(args[0], args[1]);
		}
		else {
			System.out.println("Please, Enter Valid Input.");
		}

	}
}