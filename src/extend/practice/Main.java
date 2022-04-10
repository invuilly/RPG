package extend.practice;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args){

		// 人間のパーティーを初期化する
		List<Living> humanList = new ArrayList<Living>();
		humanList.add(new Brave());
		humanList.add(new Fighter());
		humanList.add(new Wizard());
		
		// モンスターのパーティーを初期化する
		List<Living> monsterList = new ArrayList<Living>();
		monsterList.add(new Slime());
		monsterList.add(new Oak());
		monsterList.add(new Dragon());
		
		// 人間かモンスターどちらかのパーティーが全滅するまで無限ループする
		while(true) {
			// 戦闘参加者のリスト
			List<Living> allList = new ArrayList<Living>();
			allList.addAll(humanList);
			allList.addAll(monsterList);
			
			// 戦闘参加者の人数
			int number = allList.size();
			int attackerIndex = Rand.get(number);
			Living attacker = allList.get(attackerIndex);
			
			
			List<Living> defenderList;
			
			boolean isHuman = attacker instanceof Human;
			if (isHuman) {
				System.out.println("人間のターン！");
				defenderList = monsterList;
				
			} else {
				System.out.println("モンスターのターン！");
				defenderList = humanList;
			}
			
			int defenderNumber = defenderList.size();
			int defenderIndex = Rand.get(defenderNumber);
			Living defender = defenderList.get(defenderIndex);
			
			attacker.attack(defender);

				
			if (defender.hp <= 0) {
				defenderList.remove(defenderIndex);
			}
			
			if (defenderList.size() <= 0) {
				if (isHuman) {
					System.out.println("勇者たちは勝利した！");
				} else {
					System.out.println("勇者たちは敗北した。");
				}
				// ループを終了する
				break;
			}
		}
	}
}