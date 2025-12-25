/*
	The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
	Write a java program that demonstrates how to establish this class hierarchy. Declare 
	one instance variable of type String that indicates the color of a vegetable. Crete and 
	display instances of these objects. Override the toString() method of object to return a 
	string with the name of vegetable and its color. 
*/
import java.util.Scanner;
	abstract class  vegitable {
		String color;
		vegitable(String color) {
			this.color = color;
		}
	}
public class Sakbhaji {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Potato p = new Potato();
		Brijal b = new Brijal();
		Tomato t = new Tomato();

	}
}