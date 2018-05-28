package org.lanqiao;

public class warrior extends character{
	//重载
	public warrior() {
		super(1,1,1,1,1);
	}
	//重写
	public void attack(character ch) {
		float excuse=ch.resist();
		double harm=power*2;
		ch.hp=(int) (ch.hp-(harm-excuse));
		System.out.println("战士发起攻击，造成"+(harm-excuse)+"点伤害");
	}
	
	public float resist() {
		return this.power;
	}
}
