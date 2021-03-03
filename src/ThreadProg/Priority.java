package ThreadProg;

public class Priority extends Thread {
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+i);
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie) {System.out.println(ie.getMessage());}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority je1=new Priority();
		Priority je2=new Priority();
		Priority je3=new Priority();
		Priority je4=new Priority();
		
		je1.setPriority(10);
		je2.setPriority(1);
		je3.setPriority(1);
		je4.setPriority(1);
		
		je1.start();		
		je2.start();
		je3.start();
		je4.start();
	}

}
