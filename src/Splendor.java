class Bike{  
   void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  protected void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
	  Bike sb = new Splendor();//upcasting  
	  Bike b=new Bike();
	  Splendor s=new Splendor();
	  sb.run();  
	  b.run();
	  s.run();
  }  
} 