package welcome3;
import java.io.*;

public class Sleep_wait extends Thread{
	public void run() {
	for(int i=0;i<=5;i++) {
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {
			System.out.println("error occured");
		}
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
  Sleep_wait w=new Sleep_wait();
  w.start();
	}

}
