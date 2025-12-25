/*
* Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
* A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
* and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
* Each method displays one of the constants. [A] 
*/

import java.util.Scanner;

interface A {
    public int a = 25;
    public void printA();
}

interface A1 extends A {
    public int a1 = 50;
    public void printA1();
}

interface A2 extends A {
     public int a2 = 75;
    public void printA2();
}

interface A12 extends A1, A2 {
    public int a12 = 75;
    public void printA12();
}

class B implements A12 {

    public void printA() {
        System.out.println("A :" +a);
    }

    public void printA1() {
        System.out.println("A1 :" +a1);
    }

    public void printA2() {
        System.out.println("A2 :" +a2);
    }

    public void printA12() {
        System.out.println("A12 :" +a12);
    }

}

public class Constant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        B b1 = new B();
        b1.printA();
        b1.printA1();
        b1.printA2();
        b1.printA12();

    }
}
