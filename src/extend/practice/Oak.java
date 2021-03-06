package extend.practice;

public class Oak extends Monster {
	
	public Oak() {
		name = "オーク";
		hp = 80;
		offensive = 10;
	}
	
	protected void attack(Living target) {

		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
	
		System.out.println(name + "が槍で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
