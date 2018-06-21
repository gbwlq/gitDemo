package org.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//hash集合
public class HashMap_1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(1, "zhangsan");
		map1.put(2, "aa");
		Set<Integer> set=map1.keySet();
		//迭代器,获取key，获取value
		for(Iterator<Integer> iter=set.iterator();iter.hasNext();) {
			Integer key=iter.next();
			String value=map1.get(key);
			System.out.println(key+"--"+value);
			
		}
		
		
		Set<Map.Entry<Integer, String>> set1 = map1.entrySet();
		//map内置对象entry
		for(Iterator<Map.Entry<Integer, String>> iter=set1.iterator();iter.hasNext();) {
			Entry<Integer,String> entry=iter.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"---"+value);
		}
		
	}
}
