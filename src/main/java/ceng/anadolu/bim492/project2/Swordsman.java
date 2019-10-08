package ceng.anadolu.bim492.project2;

public class Swordsman extends Soldier {
	public Swordsman(){
		attackBehavior = new InfantryAttack();
		movementBehavior = new SlowWalk();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Swordsman.");
		System.out.println("I can use sword. I'm strong for pikemans,skirmishers");
		
	}
}


