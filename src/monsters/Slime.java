package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	
	// コンストラクタ
	public Slime(String name, String weapon) {
		// Monsterクラスで定義したコンストラクタを利用する
		super(name, weapon);
		super.hp = Dice.get(70, 130);
		super.offensive = Dice.get(5, 11);
	}

}
