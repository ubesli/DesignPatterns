package ceng.anadolu.bim492.project2;

public class Rifleman extends Soldier {

	public Rifleman(){
		attackBehavior = new RangedAttack();
		movementBehavior = new QuickWalk();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Rifleman.I'm strong against infantry,cavaliers,archers");
		System.out.println("I can use rifle.");
		
	}
}
