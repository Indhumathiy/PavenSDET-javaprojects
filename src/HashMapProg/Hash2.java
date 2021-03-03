package HashMapProg;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
	
	public static void main(String args[])
	{	
	HashMap<String,String> hm=new HashMap<String,String>();	
	hm.put("10", "indhu");
	hm.put("20", "sasi");
	//hm.put(20, "sasi1");  //here compiler is not giving error if you give duplicate key but in output it is displaying only one
	//System.out.println(hm);
	for(String s:hm.keySet())  //if you want keys and values or only the keys alone print s alone
			{
			System.out.println("Key is:"+s+" Value of key is "+hm.get(s));
			}
	
	for(String s1:hm.values())  //if you want only the values
	{
		System.out.println(s1);
	}
	}

}
