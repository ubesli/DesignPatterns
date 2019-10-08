package ceng.anadolu.bim492.project2;

public abstract class Soldier  {
     MovementBehavior movementBehavior;
     AttackBehavior attackBehavior;
     public Soldier(){
    	 
     }
     
     
     public void performAttack() {
    	 attackBehavior.attack();
     }
     public void performMovement() {
    	 movementBehavior.move();
     }
    

	public abstract void display();
	 public  void blank() {
	    	
	        System.out.println("=======================================");
	        
	    }
	
}
