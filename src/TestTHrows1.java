import java.io.IOException;  
class TestTHrows1{  
	
	void m() throws ArithmeticException
	{System.out.println(20/0); }
	void n()  {m(); }
	void p()  
	{
		n(); 
		//catch(Exception e) {System.out.println("handled");}
	}
   
  public static void main(String args[]){  
	  TestTHrows1 tt=new TestTHrows1();
	  try
	  {
	  tt.p();
	  }
	  catch(ArithmeticException ae) {
		  System.out.println(ae.getMessage());
	  }
	  System.out.println("other stmt");
  }  
}  