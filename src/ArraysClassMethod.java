import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//main method
public class ArraysClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 3 nos:");
		for(int i=0;i<3;i++)
		{
		a[i]=scn.nextInt();
		}
		System.out.println(Arrays.toString(a));	//toString() is the method inside Arrays class which give you/print the array elements as string seperated by commas
		scn.close();
		//Arrays.asList(a);		

		//Expanding or we can say growing the array size which is called dynamic array
		//ArrayList enables the use of dynamic array using arrayobj.get(), arrayobj.set('','') to change the arraylist value, arrayobj.size(), arrayobj.remove(index), arrayobj.clear()(to remove all elements)
		//ArrayList<Integer> alst= new ArrayList<>(Arrays.asList(a));
		//alst.add(20); //through scanner also u can get the number and add
		System.out.println(Arrays.toString(a));
	} 
	

}
