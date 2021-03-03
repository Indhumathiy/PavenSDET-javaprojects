
 public class jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][];
		a[0]=new int[1];
		a[1]=new int[3];
		a[2]=new int[4];
		//loop
		for(int i[]:a)
		{
			for(int j:i)
			{
			 System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
