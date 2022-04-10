package extend.practice;

public class Brave extends Human{
	public Brave() {
		name = "勇者";
		hp = 100;
		offensive = 10;
	}
	
	protected void attack(Living target) {
		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
		
		System.out.println(name + "が剣で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}

}
