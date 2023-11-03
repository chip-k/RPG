package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(240, 300));
		setOffensive(Dice.get(17, 23));
	}

}
