package ExceptionProg;

public class simpleExcep2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(20/2);
		}catch(NullPointerException e) {e.getMessage();}
		
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("rest of the code");
		
		

	}

}
