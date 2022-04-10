package extend.practice;

public class Slime extends Monstar{
	public Slime() {
		name = "スライム";
		hp = 100;
		offensive = 10;
	}
	
	protected void attack(Living target) {
		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
		
		System.out.println(name + "が体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
	}

}
