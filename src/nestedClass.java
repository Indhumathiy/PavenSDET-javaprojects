class outerClass
{
	static class innerClass
	{
		void print()
		{
			System.out.println("inner class method");
		}
	}
}



public class nestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass.innerClass oi=new outerClass.innerClass();
		oi.print();
		
	}

}
