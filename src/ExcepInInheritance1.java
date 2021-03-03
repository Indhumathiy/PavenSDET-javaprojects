
class parent1
{
	void calc()
	{
		System.out.println("parent class calc method");
	}
	
}


public class ExcepInInheritance1 extends parent1 {
	
	/*void calc() throws InterruptedException
	{
			Thread.sleep(2000);
			System.out.println("for interrupted exception");
		
		
		//super.calc();
		//System.out.println("child class calc method");
	}*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExcepInInheritance1 ei=new ExcepInInheritance1();
		ei.calc();
	}

}
