
public class throwkeyword {
	
	private void call(int age) {
		// TODO Auto-generated method stub
		if(age<18)
		{
			throw new Error("You are not eligible");
		}
		else
		{
			System.out.println("U r eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwkeyword tk=new throwkeyword();
		tk.call(12);
		System.out.println("normal flow");
	}

	

}
