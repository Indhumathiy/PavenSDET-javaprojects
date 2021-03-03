interface outerinter
{
	interface innerinter
	{
		void display();
		default void print()
		{
			System.out.println("inner interface default print method");
		}
		
	}
	
	
	static int method1(int i)
	{
		//System.out.println("Outer interface static method");
		return i;
	}
	
	void sum(int a,int b);
	
}



class TestNestedInterface1 implements outerinter, outerinter.innerinter
{
	public void sum(int x, int y)
	{
	System.out.println(x+y);	
	}
	
	public void display()
	{
		System.out.println("ineer inter display method");
	}
	
	public static void main(String args[])
	{
		//outerinter oi=new TestNestedInterface1();
		TestNestedInterface1 c1=new TestNestedInterface1(); //since this class implements two interfaces, this has to override all the abstract methods in the interfaces
		c1.sum(50, 48);//accessing nested interface method
		c1.display();
		System.out.println(outerinter.method1(15));  //accessing static method of an interface
		
		outerinter.innerinter ref=new TestNestedInterface1();
		ref.print();
	}
}