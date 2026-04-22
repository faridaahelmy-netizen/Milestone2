package game.engine.monsters;

import game.engine.Constants;
import game.engine.Role;

public class Schemer extends Monster {
	
	public Schemer(String name, String description, Role role, int energy) {
		super(name, description, role, energy);
	}

	@Override
	void executePowerupEffect(Monster opponentMonster) {
		// TODO Auto-generated method stub
		
	}
	 private int stealEnergyFrom(Monster target){
		 if(target.getEnergy()>Constants.SCHEMER_STEAL){
			 return Constants.SCHEMER_STEAL;
		 }
		 else
			 return target.getEnergy();
	 }
	
}
