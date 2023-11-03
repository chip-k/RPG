package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	
	public Dragon(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(270, 330));
		setOffensive(Dice.get(12, 18));
	}

}
