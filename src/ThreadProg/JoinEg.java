package ThreadProg;

public class JoinEg extends Thread {
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie) {System.out.println(ie.getMessage());}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinEg je1=new JoinEg();
		JoinEg je2=new JoinEg();
		JoinEg je3=new JoinEg();
		JoinEg je4=new JoinEg();
		
		je1.start();
		try
		{
			je1.join();   //so if you say thread1 je1.join after starting that thread, task schedular will wait for that je1 to complete itz execution part and then let other thread to enter running state
		}catch(InterruptedException ie) {System.out.println(ie.getMessage());}
		
		je2.start();
		je3.start();
		je4.start();
	}

}
