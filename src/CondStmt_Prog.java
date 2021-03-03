import java.util.*;
public class CondStmt_Prog {

	public static void main(String[] args) {
	/*	// If-else
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=scn.nextLine();
        System.out.println("Enter age:");
        int age=scn.nextInt();
        System.out.println("The person "+ name +" age is "+age);
        scn.close();
        if(age<18)
        {
        	System.out.println("She is minor");
        }
        else
        {
        	System.out.println("She is major");
        }    */
		
		//nested if else
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter day in int 1-7: ");
		int day=scn.nextInt();
	    if(day==1)
	    {
	    	System.out.println("It is sunday");
	    }
	    else if(day==2)
	    {
	    	System.out.println("It is monday");
	    }
	    else if(day==3)
	    {
	    	System.out.println("It is tuesday");
	    }
	   else if(day==4)
	   {
		   System.out.println("It is wednesday");
	   }
	   else if(day==5)
	   {
		   System.out.println("It is thursday");
	   }
	   else if(day==6)
	   {
		   System.out.println("It is Friday");
	   }
	   else
	   {
		   System.out.println("It is saturday");
	   }
	    scn.close();
	   }
	   

}
