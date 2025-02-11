package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	
	// コンストラクタ
	public Dragon(String name, String weapon) {
		// Monsterクラスで定義したコンストラクタを利用する
		super(name, weapon);
		super.hp = Dice.get(270, 330);
		super.offensive = Dice.get(12, 18);
	}


}
