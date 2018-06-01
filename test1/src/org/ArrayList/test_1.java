package org.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class test_1 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("aa");
		list.add("a");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		LinkedList<String> list_2=new LinkedList<String>();
		list_2.add("e");
		list_2.add("ww");
		list_2.add("wwww");
		for(int i=0;i<list_2.size();i++) {
			System.out.println(list_2.get(i));
		}
		System.out.println();	
		
			ArrayList list_5=new ArrayList();
			list_5.add("a");
			list_5.add(123);
			for(int i4=0;i4<list_5.size();i4++) {
				System.out.println(list_5.get(i4));
			}
			
		}
	

	
	private static void list(String string) {
		
	}

	
	
}


































































