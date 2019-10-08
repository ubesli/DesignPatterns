package ceng.anadolu.bim492.project2;

public class App 
{
    public static void main( String[] args )
    {
    	 Soldier archer = new Archer();
    	 archer.display();
    	 archer.performAttack();
    	 archer.performMovement();
    	 
    	 Soldier skirmisher = new Skirmisher();
    	 skirmisher.display();
    	 skirmisher.performAttack();
    	 skirmisher.performMovement();
    	 
      Soldier ranged = new Rifleman();
      ranged.display();
      ranged.performAttack();
      ranged.performMovement();
     
     Soldier swordman = new Swordsman();
     swordman.display();
     swordman.performAttack();
     swordman.performMovement();
     
    Soldier pikeman = new Pikeman();
    pikeman.display();
    pikeman.performAttack();
    pikeman.performMovement();
     
     Soldier knight = new Knight();
     knight.display();
     knight.performAttack();
     knight.performMovement();
     
     Soldier scout = new Scout();
     scout.display();
     scout.performAttack();
     scout.performMovement();
      }
    
    
    
    
    
   
}