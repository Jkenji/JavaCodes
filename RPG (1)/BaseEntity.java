abstract class BaseEntity {
    protected int hp;
    protected int defense;
    protected int potionNumber;
    protected int speed;
    protected String name;

    public BaseEntity(String name, int hp, int defense, int potionNumber, int speed) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.potionNumber = potionNumber;
        this.speed = speed;
    }

    public String getName(){
      return this.name;
    }
  
    public int getHp(){
      return this.hp;
    }

    public void setHp(int hpAmount){
      this.hp = hpAmount;
    }

    public int getSpeed(){
      return this.speed;
    }

    public int getDefense(){
      return this.defense;
    }

    public abstract int attack(BaseEntity entity);

    public abstract void defend();

    public abstract void usePotion();
}