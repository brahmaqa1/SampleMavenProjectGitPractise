package JavaBasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer> ();
		

		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		System.out.println("hm ="+ hm);
		//hm ={A=1, B=2, C=3}
		
		Set<Entry<String, Integer>> me= hm.entrySet();
		for(Entry<String, Integer>  each: me)
		{
			System.out.println("key= "+ each.getKey()  +", val="+ each.getValue());
//			        key= A, val=1
//					key= B, val=2
//					key= C, val=3
		}
		
		// get all keys
		Set<String> se= hm.keySet();		
		for(String val  : se)
		{
			System.out.println("all keys="+ val);
		}
		
//		all keys=A
//				all keys=B
//				all keys=C
		
		// get all vals
		Collection<Integer> cVals= hm.values();
		for(Integer eachVal : cVals)
		{
			System.out.println("each vals="+eachVal);
		}
//		each vals=1
//				each vals=2
//				each vals=3
		
		// for each 
		hm.forEach((key, value) -> {

		      // decrease value by 10%
		      
		      System.out.print(key + "=" + value + " ");
		    });
		
		
	}
}
