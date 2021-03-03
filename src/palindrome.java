
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=151;
		//String s=Integer.toString(i);
		String s="madams";
		int len=s.length();
		String s1="";
		
		for(int i=(len-1);i>=0;i--)
		{
			s1+=s.substring(i,++i);
			i-=1;			
		}
		System.out.println("s1 is " +s1);
		System.out.println(s);
		if(s1.equalsIgnoreCase(s))
		{
		 System.out.println("It is a palindrome");
		}
		else {System.out.println("It is not a palindrome");}

	}

	
}
