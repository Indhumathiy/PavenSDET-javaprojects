package p1;

public class constructorEg2 {
	String name;
	private constructorEg2() 
	{
		this.name="Indhu";
		System.out.println(name);
		print();
	}
	
	void print()
	{
		System.out.println("hai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorEg2 ce=new constructorEg2();
		//System.out.println(ce.name);
	}

}
