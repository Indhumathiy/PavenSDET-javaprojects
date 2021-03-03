
public class Fibonacci {

	public static void main(String[] args) {
		int a=0;int b=1;int c=0;
		System.out.print(a+",");
		int count=0;
		while(count<=6)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
			count++;
		}
		// TODO Auto-generated method stub

	}

}
