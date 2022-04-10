package extend.practice;

public class Fighter extends Human{
	public Fighter() {
		name = "戦士";
		hp = 120;
		offensive = 30;
	}
	
	@Override
	protected void attack(Living target) {
		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
		
		System.out.println(name + "が斧で攻撃！"  + damage + "のダメージ！");
	}

}
