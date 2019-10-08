package ceng.anadolu.bim492.project2;

public class Skirmisher extends Soldier {

	public Skirmisher(){
		attackBehavior = new RangedAttack();
		movementBehavior = new QuickWalk();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Skirmisher.");
		System.out.println("I can throw spears.I'm strong against archers,riflemans.");
		
	}
}