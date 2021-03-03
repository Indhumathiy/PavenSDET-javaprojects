package AbstractAndInterface;

interface A
{
void display();
void display1();
void display2();
default void print() {System.out.println("This is a mathod inside interface A");}
}



abstract class B implements A
{
	public void display() {System.out.println("Iam display method");}
}



public class InterfaceEg extends B {
	
	public void display1() {System.out.println("Iam display1 method");}
	public void display2() {System.out.println("Iam display2 method");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new InterfaceEg();
		obj.display();
		obj.display1();obj.display2();

	}

}


interface A1 extends A
{
	
}
