package ThreadProg;

public class ThreadInterface1 implements Runnable {

	public void run()
	{
		System.out.println("THread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadInterface1 ti=new ThreadInterface1();
		Thread t=new Thread(ti);
		t.start();
	}

}
