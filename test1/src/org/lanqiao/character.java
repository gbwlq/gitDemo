package org.lanqiao;

public class character {
	//属性
	public int hp;
	public int mp;
	public int power;
	public int intelligence;
	public int speed;
	//设计人物属性，重载
	public character(int hp,int mp,int power,int intelligence,int speed) {
		this.hp=hp;
		this.mp=mp;
		this.power=power;
		this.intelligence=intelligence;
		this.speed=speed;
	}
	//攻击方法
	public void attack(character ch) {
		System.out.println("发起攻击");
	}
	//移动方法
	public void move() {
		System.out.println("进行移动");
	}
	//抵抗方法
	public float resist() {
		System.out.println("每个职业主属性*抵抗系数");
		return 0;
	}
	//输出属性
	public void info() {
		System.out.println("属性:[hp "+hp+",mp "+mp+",power "+power+
				",intelligence "+intelligence+",speed "+speed+"]");
	}
}
