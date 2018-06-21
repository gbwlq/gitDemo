package org.ArrayList;

import java.util.LinkedList;
//栈
public class myStack {

	LinkedList<String> l=new LinkedList<String>();
	
	public void push(String str) {
		l.addFirst(str);
	}
	
	public String pop() {
		return l.removeFirst();
	}
	public static void main(String[] args) {
		myStack s=new myStack();
		s.push("455");
		s.push("sasa");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
