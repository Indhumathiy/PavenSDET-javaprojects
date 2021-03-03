
public class Privatenestedclass {

	 private class inner  //u can even mark the nested class as protected
	{
		int i=10;
		void display() {System.out.println(i);}
	}
	
	void extract()  //private class members can be accessed by outer class like this
	{
		inner in=new inner();
		in.display();
	}
	
	
	static class staticnestedclass
	{
		void print() {System.out.println("Iam a nested static class"); }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Privatenestedclass in=new Privatenestedclass();
		in.extract();
		//new inner().display();  ---invalid only we can access the private member thru method in outer class
		
		Privatenestedclass.staticnestedclass ps=new Privatenestedclass.staticnestedclass();
		ps.print();
	}

}
