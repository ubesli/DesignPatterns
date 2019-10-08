package ceng.anadolu.bim492.project2;

public class Knight extends Soldier{
	public Knight(){
		attackBehavior = new CavalryAttack();
		movementBehavior = new FastRun();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Knight.");
		System.out.println("I ride horse and use sword.I'm strong against archers,infantry,skirmishers");
		
	}
}


