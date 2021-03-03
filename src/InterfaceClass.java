
public class InterfaceClass implements SimpleInterface,SimpleInterface1 {

		public void print() {
			
			System.out.println("This is print method that belongs to SimpleInterface interface and var value is:"+ (var+1));
			}
		
		public void display()
		{
			System.out.println("This is display method that belongs to SimpleInterface1 interface and var value is:" +var1);
		}
		
		public void display(int a, int b)
		{
			System.out.println("This is display method that belongs to InterfaceClass class and sum of a+b is:" +(a+b));
		}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		InterfaceClass ic=new InterfaceClass();
		ic.print();
		ic.display();
		ic.display(20, 55);
		
		//extra
		//Object ac=ic.clone();
		//System.out.println(ac.equals(ic));
	}

}
