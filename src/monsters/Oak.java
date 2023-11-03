package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	
	public Oak(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(170, 230));
		setOffensive(Dice.get(9, 15));
	}

}
