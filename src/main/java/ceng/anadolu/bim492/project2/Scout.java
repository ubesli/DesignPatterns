package ceng.anadolu.bim492.project2;

public class Scout extends Soldier{
	public Scout() {
		attackBehavior = new CavalryAttack();
		movementBehavior = new FastRun();
	}
	@Override
	public void display() {
		blank();
		System.out.println("I'm a Scout.");
		System.out.println("I ride horse and use sword.I'm strong against archers.");
		
	}
}
