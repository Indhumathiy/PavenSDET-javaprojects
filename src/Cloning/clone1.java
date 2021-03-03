package Cloning;

public class clone1 implements Cloneable {
	int i;
	
	clone1()
	{
		i=10;
	}
	
	public void display()
	{
		//int i=10;
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clone1 c1=new clone1();
		clone1 c2=null;
		try {
		c2=(clone1)c1.clone();   //so to use the clone() you have to implement Cloneable interface and catch the corres. exception
		}
		catch(CloneNotSupportedException ce) {
			System.out.println(ce.getMessage());
											}
		c2.i=20;
		c1.display();
		c2.display();

	}

}
//Here c1 object of class clone1 is copied to the reference of the same class clone1
//so it is copied to the same memory location. this is shallow clone method.
//If we create a copy in different memory location it is deep clone.

//When to go for cloning - when we want the properties of one object with slight change 
//then we can clone that object and change the properties we want.Also in some cases 
//before returning the result to the user, application /Dev needs to make a copy of few 
//properties so there we can clone it and return