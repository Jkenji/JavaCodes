class Boss extends BaseEntity {
    private int damage;
  
    public Boss(String name,
                  int hp,
                  int potionNumber,
                  int speed,
                  int defense,
               int damage) {
        super(name, hp, defense, potionNumber, speed);
      this.damage = damage;
    }
  
    @Override
    public int attack(BaseEntity entity) {
        System.out.println("Player attacks: " + entity.getName());

        return this.damage;
    }

    @Override
    public void defend() {
        System.out.println("Player defends!");
    }

    @Override
    public void usePotion() {
        System.out.println("Player uses a potion!");
    }
}