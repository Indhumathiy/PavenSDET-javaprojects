import java.util.Scanner;
public class methodProg {

	static int add;
	
	public static void sum(int num1, int num2) {
		// TODO Auto-generated method stub
		add=num1+num2;		
	}
	
	public void print()
	{
		System.out.println(add);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber[]=new int[2];
		
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter 2 nos:");
		for(int i=0;i<2;i++)
		{
		 firstNumber[i]=scn.nextInt();	
		}
		
		sum(firstNumber[0],firstNumber[1]);	//calling method without class object so static is required in the method "static void sum()" 
		
		scn.close();
		
		methodProg mp=new methodProg();  
		mp.print();  //this method is called thru class object so no need of static keyword in the method

	}

	
}
