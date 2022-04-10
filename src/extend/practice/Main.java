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
			// 戦闘参加者のリスト（人間＋モンスター）
			List<Living> allList = new ArrayList<Living>();
			allList.addAll(humanList);
			allList.addAll(monsterList);
			
			// 戦闘参加者の人数
			int number = allList.size();
			// 戦闘参加者のリストから、ランダムに攻撃者のインデックスを決める
			int attackerIndex = Rand.get(number);
			// 攻撃者のオブジェクトを取得
			Living attacker = allList.get(attackerIndex);
			
			
			// 防御側のリスト
			List<Living> defenderList;
			
			// 人間の攻撃ターンか判定する
			boolean isHuman = attacker instanceof Human;
			if (isHuman) {
				System.out.println("人間のターン！");
				defenderList = monsterList;
				
			} else {
				System.out.println("モンスターのターン！");
				defenderList = humanList;
			}
			
			// 防御側人数
			int defenderNumber = defenderList.size();
			// 防御者をランダムで決める
			int defenderIndex = Rand.get(defenderNumber);
			// 防御者のオブジェクトを取得
			Living defender = defenderList.get(defenderIndex);
			
			// 攻撃を実行する
			attacker.attack(defender);

				
			// 防御側のHPが0以下の場合
			if (defender.hp <= 0) {
				// 死亡した生物をリストから削除する
				defenderList.remove(defenderIndex);
			}
			
			// 防御側のパーティーが全滅している場合
			if (defenderList.size() <= 0) {
				if (isHuman) {
					System.out.println("勇者は勝利した！");
				} else {
					System.out.println("勇者は敗北した。");
				}
				// ループを終了する
				break;
			}
		}
	}
}