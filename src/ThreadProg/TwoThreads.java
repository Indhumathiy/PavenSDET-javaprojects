package ThreadProg;

public class TwoThreads extends Thread {

	public void run()
	{
		for(int i=1;i<5;i++)
		{
			//getname, getid of the current running thread, priority number			
			System.out.print(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority()+" "+i);
			try
			{
			Thread.sleep(1500);  //Each thread say if tt1 sleep, the schedular (part of JVM) will select next run to enter running state
			}catch(InterruptedException ie) {System.out.println(ie.getMessage());}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoThreads tt1=new TwoThreads();  //here we created and started 2 threads.
		TwoThreads tt2=new TwoThreads();
		
		tt1.start(); 
		tt2.start();
	
	}

}
