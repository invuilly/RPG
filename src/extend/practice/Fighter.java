package extend.practice;

public class Fighter extends Human {
	
	public Fighter() {
		name = "戦士";
		hp = 150;
		offensive = 8;
	}

	protected void attack(Living target) {

		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
	
		System.out.println(name + "がハンマーで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
