package AbstractAndInterface;

abstract class class1
{
	void run( ) {System.out.println("This is abs class non-abs method run"); }
	
	abstract void display();
	
	class1()
	{
	System.out.println("abstract class constructor");	
	}
	
	static final int print()
	{
		return 10;
	}
	
}




class class2 extends class1
{
	void display()
	{
		System.out.println("abstract method implementation in child class");
	}
	
	//static int print() { }
}





public class Abstractclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 c1=new class2();
		c1.run();
		c1.display();
		System.out.println(c1.print());
	}

}
