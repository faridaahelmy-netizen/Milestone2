package game.engine.monsters;

import java.util.ArrayList;

import game.engine.Board;
import game.engine.Constants;
import game.engine.Role;

public class Schemer extends Monster {
	
	public Schemer(String name, String description, Role role, int energy) {
		super(name, description, role, energy);
	}

	@Override
	void executePowerupEffect(Monster opponentMonster) {
		int total=stealEnergyFrom(opponentMonster);
		ArrayList<Monster> stationedMonsters=Board.getStationedMonsters();
		for(int i=0;i<stationedMonsters.size();i++){
			Monster m= stationedMonsters.get(i);
			total+=stealEnergyFrom(m);
		}
		this.alterEnergy(total);
	}
	
	public void alterEnergy(int energy){
		super.alterEnergy(energy+10);
	}
	 private int stealEnergyFrom(Monster target){
		 int stolen;
		 if(target.getEnergy()>Constants.SCHEMER_STEAL){
			 stolen= Constants.SCHEMER_STEAL;
		 }
		 else
			 stolen= target.getEnergy();
		 
		 target.alterEnergy(-stolen);
		 return stolen;	 
	 }

	
	
}
