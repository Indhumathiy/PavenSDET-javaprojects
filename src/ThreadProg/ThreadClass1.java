package ThreadProg;

public class ThreadClass1 extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 tc=new ThreadClass1();
		tc.start(); //When u start the thread it automatically calls run()
		//tc.run();
	}

}
