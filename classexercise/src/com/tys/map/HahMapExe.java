package com.tys.map;
import java.util.*;
import java.util.Map.Entry;

public class HahMapExe {
	public static void main(String args[])
	{
		HashMap <String,Long> hash=new HashMap<>();
		hash.put("sow",8825583593l);
		hash.put("asha", 9445946998l);
		hash.put("saro", 8680024026L);
		hash.put(null, 9787771437l);
		hash.put(null, 9787771437l);
		
		//now to iterate to..we don't have any method here so convert this to set
		Set<String>keyset=hash.keySet();
		for (String string : keyset) {
			System.out.println(string +":"+hash.get(string));
		}
		System.out.println("===========================================");
		Set<Entry<String, Long>> entrySet = hash.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
