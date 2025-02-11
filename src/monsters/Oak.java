package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	
	// コンストラクタ
			public Oak(String name, String weapon) {
				// Monsterクラスで定義したコンストラクタを利用する
				super(name, weapon);
				super.hp = Dice.get(170, 230);
				super.offensive = Dice.get(9, 15);
			}

}
