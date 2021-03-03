
public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		b[0][0]=2;
		b[0][1]=2;
		b[1][0]=2;
		b[1][1]=2;
		
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
			{
			if(i==0)
			  {	
			  System.out.print((a[i][j]*b[i][j]) + (a[i][j]*b[++i][j]));
			  //System.out.print(c[i][j]);
			  i=i-1;
			  }
			if(i==1)
			  {
			  System.out.print((a[i][j]*b[--i][j])+(a[++i][j]*b[i][j]));	
			  }
			System.out.print(" ");
			}
		System.out.println();
		}

	}

}
