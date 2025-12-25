/*
*	Write an application that executes two threads. One thread displays "Good Morning" 
*	every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
*	milliseconds. Create the threads by implementing the Runnable interface.
*/


class Demo {
	public void displayMorning() {

		for (int i = 0; i < 5; i++) 
		{

			System.out.println("Good Morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}


	public void displayAfternoon() 
	
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Good Afternoon");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}


public class Good_Moring 
{
	public static void main(String[] args) 
	{
		
		Demo demo = new Demo();

		Thread morningThread = new Thread(new Runnable() {
			public void run() {
				demo.displayMorning();
			}
		});

		Thread afternoonThread = new Thread(new Runnable() {
			public void run() {
				demo.displayAfternoon();
			}
		});
		
		morningThread.start();
		afternoonThread.start();
		
		try {
			morningThread.join();
			afternoonThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}