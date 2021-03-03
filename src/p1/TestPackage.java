package p1;

public class TestPackage {
	static final int i;
	static {i=20;}
	
	final int j;
	
	private TestPackage()
	{
		j=20;
	
	}
	
	public static void main(String args[])
	{
		TestPackage tp=new TestPackage();
		System.out.println(tp.j);
	}

}
