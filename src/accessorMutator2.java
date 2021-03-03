
public class accessorMutator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessorMutator1 am1=new accessorMutator1();
		// am1.mark=45;  //if you put the mark variable to private and try to access like this it will throw error.
		am1.set(450);
		System.out.println(am1.get());
	}

}
