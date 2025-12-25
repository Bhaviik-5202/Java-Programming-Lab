/*
 * Write a java program that implements a multi-thread application that has 
* three threads. First thread generates random integer every 1 second and if 
* the value is even, second thread computes the square of the number and 
* prints. If the value is odd, the third thread will print the value of cube of 
* the number. [
 */
import java.util.*;
import java.util.Random;

public class Cube_Square {
    public static void main(String[] args) {

        Thread randomNumberThread = new Thread(new Runnable() {
            public void run() {
                Random random = new Random();
                while (true) {
                    int rN = random.nextInt(100); 
                    System.out.println("Random Number: " + rN);
                    if (rN% 2 == 0) {
                        System.out.println("Square: " + ( rN * rN ));
                    } else {
                        System.out.println("Cube: " + ( rN * rN * rN ));
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread squareThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                }
            }
        });

        Thread cubeThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                }
            }
        });

        randomNumberThread.start();
        squareThread.start();
        cubeThread.start();
    }
}



