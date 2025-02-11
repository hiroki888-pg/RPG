package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	// コンストラクタ
	public Brave(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		super.hp = Dice.get(170, 230);
		super.offensive = Dice.get(7, 13);
	}
			

}