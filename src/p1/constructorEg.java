package p1;

public class constructorEg {
	String name;
	private constructorEg() 
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
		constructorEg ce=new constructorEg();
		//System.out.println(ce.name);
	}

}
