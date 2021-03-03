
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=10;
		arr[0][2]=10;
		arr[1][0]=50;
		
		//Just to check the length fn
		int a[]=new int[2];
		a[0]=10;
		System.out.println(a.length);  
		
	/*	for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}  */
		
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}

	}

}
