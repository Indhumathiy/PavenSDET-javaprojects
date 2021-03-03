import java.util.Scanner;

public class SwitchCase_Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter day in int 1-4: ");
		int day=scn.nextInt();
		switch(day)
		{
		case 1:System.out.println("It is sunday");break;
		case 2:System.out.println("It is monday");break;
		case 3:System.out.println("It is tuesday");break;
		default:System.out.println("It is wednesday");
		}
		scn.close();
	}

}
