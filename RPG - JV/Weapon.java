public abstract class Weapon {
    protected String name;
    protected int baseDamage;
    protected String damageType;
    protected WeaponDamageCalculator damageCalculator;

    public Weapon(String name, String damageType, int baseDamage, WeaponDamageCalculator damageCalculator) {
        this.name = name;
        this.damageType = damageType;
        this.baseDamage = baseDamage;
        this.damageCalculator = damageCalculator;
    }
  
    public String getName() {
        return name;
    }

    public String getDamageType() {
        return damageType;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int calculateWeaponDamage(Player player) {
        return damageCalculator.calculateWeaponDamage(player, this.baseDamage);
    }
}