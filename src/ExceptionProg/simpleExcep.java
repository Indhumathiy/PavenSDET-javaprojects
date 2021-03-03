package ExceptionProg;

public class simpleExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(20/0);
		}catch(Exception ae) {System.out.println(ae.getMessage());}
		
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("rest of the code");
		
		

	}

}
