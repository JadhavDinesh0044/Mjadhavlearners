package welcome3;
class Runner implements Runnable{
	public void run() {
		System.out.println("Using runnable interface");
	}
}

public class Threads  extends Thread{
	public void run() {
	System.out.println("It's good ");
	}

	public static void main(String[] args) {
		//program by extending the thread class
		Threads t=new Threads();
		t.start();
		//below code is for implementing runnable interface
		Runner r=new Runner();
		Thread th=new Thread(r);
		th.start();
	}

}
