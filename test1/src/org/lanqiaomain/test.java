package org.lanqiaomain;

import org.lanqiao.warrior;

public class test {
	public static void main(String[] args) {
		warrior war=new warrior();
		warrior war1=new warrior();
		war1.info();
		war1.attack(war);
		war.info();
	}
}
