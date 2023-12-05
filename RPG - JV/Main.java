class Main {
  public static void main(String[] args) {
    Fire fire = new Fire();
    Boss boss1 = new Boss("Royal Guard", 15, 3, 10, 5, 15);
    Boss boss2 = new Boss("Royal Guard", 15, 3, 10, 5, 15);
    Boss boss3 = new Boss("Royal Guard", 15, 3, 10, 5, 15);
    
    Player player1 = new Player("Bob", 50, 3, 10, 5, 3);

    player1.setWeapon(new IronSword());

    Battle battleHandler = new Battle();

    battleHandler.start(player1, boss1);

    System.out.println("Batalha encerrada 1");

    battleHandler.start(player1, boss2);

    battleHandler.start(player1, boss3);

    System.out.println("Batalha encerrada 2");
  }
}