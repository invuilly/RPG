package extend.practice;

public class Wizard extends Human {

	public Wizard() { 
		name = "魔法使い";
		hp = 70;
		offensive = 20;
	}

	protected void attack(Living target) {

		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
	
		System.out.println(name + "が魔法で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
