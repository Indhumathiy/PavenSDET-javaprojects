import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of words you are going to enter :: ");
		int size = sc.nextInt();
		String myArray[] = new String[size];
		System.out.println("Enter words to check for palindrome :: ");
		for(int n=0; n<size; n++)
		{
		myArray[n] = sc.next();
		}
		
		System.out.println(Arrays.toString(myArray));
		
		int Noofwords=myArray.length;
		String s1="";
     for(int itr=0;itr<Noofwords;itr++)
     {
      int len=myArray[itr].length();
		
	for(int i=(len-1);i>=0;i--)
	{
		s1+=myArray[itr].substring(i,++i);
		i-=1;			
	}
	System.out.println("s1 is " +s1);
	System.out.println("str is " +myArray[itr]);
	if(s1.equalsIgnoreCase(myArray[itr]))
	{
	 System.out.println("It is a palindrome");
	}
	else {System.out.println("It is not a palindrome");}
	s1="";
     }
     
	//myArray[itr] =scn.next(); 
   sc.close();
	}

}
