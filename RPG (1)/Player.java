class Player extends BaseEntity {
    private Weapon weapon;
    public int strength;
  
    public Player(String name,
                  int hp,
                  int potionNumber,
                  int strength,
                  int speed,
                  int defense) {
        super(name, hp, defense, potionNumber, speed);
      this.strength = strength;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int getStrength(){
      return this.strength;
    }
  
    @Override
    public int attack(BaseEntity entity) {
        System.out.println("Player attacks: " + entity.getName());

        int weaponDamage = this.weapon.calculateWeaponDamage(this);

        int finalDamage = weaponDamage - entity.getDefense();

        return finalDamage;
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