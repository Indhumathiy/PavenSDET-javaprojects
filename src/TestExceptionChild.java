import java.io.IOException;


class Parent2{  
  void msg()throws IOException {System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent2{  
  void msg(){  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]) throws Exception{  
	  Parent2 p=new TestExceptionChild();  
   p.msg();  
  }  
} 