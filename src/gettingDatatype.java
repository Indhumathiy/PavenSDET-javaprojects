import java.util.*;

public class gettingDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string to check palindrome:");
		String s=scn.nextLine();
		System.out.println(s.getClass());
		System.out.println("entered string is:" +s);
		scn.close();
	}

}
