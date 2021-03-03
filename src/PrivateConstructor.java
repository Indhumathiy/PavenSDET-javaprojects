
public class PrivateConstructor {
	
	static PrivateConstructor obj=null;
	
	private PrivateConstructor() { }
	
	
	static PrivateConstructor createObject() {
			// TODO Auto-generated method stub
			if (obj==null)
			{
				obj=new PrivateConstructor();
			}
			return obj;
		}

	public void display() {System.out.println("Singleton class");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructor pc=PrivateConstructor.createObject();
		pc.display();		
		
	}

	
}
