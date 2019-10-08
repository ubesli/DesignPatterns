package ceng.anadolu.bim492.project2;

public class Pikeman extends Soldier {

	public Pikeman(){
		attackBehavior = new InfantryAttack();
		movementBehavior = new SlowWalk();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Pikeman.");
		System.out.println("I can use spears, I'm strong for cavaliers.");
		
	}
}

