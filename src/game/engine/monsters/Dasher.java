package game.engine.monsters;

import game.engine.Role;

public class Dasher extends Monster {
	private int momentumTurns;

	public Dasher(String name, String description, Role role, int energy) {
		super(name, description, role, energy);
		this.momentumTurns = 0;
	}
	
	public int getMomentumTurns() {
		return momentumTurns;
	}
	
	public void setMomentumTurns(int momentumTurns) {
		this.momentumTurns = momentumTurns;
	}

	@Override
	void executePowerupEffect(Monster opponentMonster) {
		this.setMomentumTurns(3);
		
	}
	public void move(int distance){
		if(getMomentumTurns()>0){
			super.move(distance*3);
		}
		else
			super.move(distance*2);
	}
	public void decrementMomentum(){
		if(momentumTurns>0)
			momentumTurns--; 
	}
	
}