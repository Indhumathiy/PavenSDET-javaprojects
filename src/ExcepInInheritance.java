 class parent
{
	void calc()
	{
		System.out.println("parent class calc method");
	}
	
}



public class ExcepInInheritance extends parent {
	
	void calc() throws ArithmeticException
	{
		
			System.out.println(20/0);
			
		/*catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}*/
		super.calc();
		System.out.println("child class calc method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepInInheritance ei=new ExcepInInheritance();
		ei.calc();
	}

}
