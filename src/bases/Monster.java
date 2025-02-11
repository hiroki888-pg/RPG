package bases;

import utils.Dice;

public abstract class Monster extends Living {
	
	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = Dice.get(1, 10);
		
		// 相手のHPをダメージ値だけ減らす
		target.hp -= damage;
		
		// コンソールにステータスを表示
		System.out.println("「" + super.name + "」 が「" + super.weapon + "」 で攻撃！「"
		+ target.name + "」 に「" + damage + "」 のダメージを与えた。");
		
	}

}
