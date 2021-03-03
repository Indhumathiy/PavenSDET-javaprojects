package HashMapProg;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {
	
	public static void main(String args[])
	{	
	HashMap<Integer,String> hm=new HashMap<Integer,String>();	
	hm.put(10, "indhu");
	hm.put(20, "sasi");
	//hm.put(20, "sasi1");
	//System.out.println(hm);
	for(Integer i:hm.keySet())
			{
			System.out.println("Key is:"+i+" Value of key is "+hm.get(i));
			}
	}

}
