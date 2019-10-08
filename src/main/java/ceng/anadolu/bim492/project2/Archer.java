package ceng.anadolu.bim492.project2;

public class Archer extends Soldier {

	public Archer(){
		attackBehavior = new RangedAttack();
		movementBehavior = new QuickWalk();
	}
	@Override
	public void display() {
		blank();
		
		System.out.println("I'm a Archer.I'm strong against infantry.");
		System.out.println("I can shoot arrows.");
		
	}
}
