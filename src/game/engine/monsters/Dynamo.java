package game.engine.monsters;

import game.engine.Role;

public class Dynamo extends Monster {
	
	public Dynamo(String name, String description, Role role, int energy) {
		super(name, description, role, energy);
	}
	
	public void alterEnergy(int energy){
		energy=energy*2;
	}

	@Override
	void executePowerupEffect(Monster opponentMonster) {
		opponentMonster.setFrozen(true);
		
	}
	
}
