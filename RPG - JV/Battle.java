import java.util.Scanner;

class Battle {
  public boolean battleRunning = false;
  
  public static void handleAttack(BaseEntity attacker, BaseEntity defender){
      int damage = attacker.attack(defender);
    
      int initialDefenderHp = defender.getHp();

      System.out.println(attacker.getName() + " does " + damage + " damage to " + defender.getName());

      defender.setHp(initialDefenderHp - damage);

      System.out.println(defender.getName() + " hp left: " + defender.getHp());
  }

  public void start(BaseEntity one, BaseEntity two) {
    this.battleRunning = true;
    
    while(battleRunning){
        System.out.println("Digite 1 para atacar");
        Scanner scanner = new Scanner(System.in); 

        int choice = scanner.nextInt();
  
        if(choice == 1){
          Battle.handleAttack(one, two);
        } else if(choice == 2){
          this.end();
        } else if (choice == 3){
          this.gameOver();
        }
    }
  }

  private void end(){
    this.battleRunning = false;
  }

  private void gameOver(){
    System.exit(0);
  }
}