/* 
*	Write a program to create two threads, one thread will print odd numbers and second 
*	thread will print even numbers between 1 to 20 numbers.
*/

public class Odd_Even {
	public static void main( String[] args ) {
		Thread oddThread = new Thread(new Runnable() {

			public void run() 
			{

				for (int i = 1; i <= 20; i += 2) 
				{
					System.out.println("Odd Number Print: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});

		Thread evenThread = new Thread(new Runnable() 
		
		{
			public void run() {

				for (int i = 2; i <= 20; i += 2) {
					System.out.println("Even Number Print: " + i);
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		oddThread.start();
		evenThread.start();


		try {
			oddThread.join();
			evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}



