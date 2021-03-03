
public class ThrowsExcepEg {

	void call() 
	{
		
		try
		{
		Thread.sleep(4000);
		System.out.println("Interrupting thread");
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ThrowsExcepEg tee=new ThrowsExcepEg();
		tee.call();
		System.out.println("hai");
	}

}
