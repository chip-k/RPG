package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(170, 230));
		setOffensive(Dice.get(7, 13));
	}

}
