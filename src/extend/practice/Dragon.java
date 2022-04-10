package extend.practice;

public class Dragon extends Monster{
	public Dragon() {
		name = "ドラゴン";
		hp = 150;
		offensive = 15;
	}
	
	@Override
	protected void attack(Living target) {
		int damage = offensive * Rand.get(10);
		target.hp = target.hp - damage;
		
		System.out.println(name + "が炎で攻撃！"  + damage + "のダメージ！");
	}

}
