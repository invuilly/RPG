package extend.practice;

public class Slime extends Monster {
	
	public Slime() {
		name = "スライム";
		hp = 50;
		offensive = 3;
	}
	
	protected void attack(Living target) {

		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
	
		System.out.println(name + "が体当りで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
