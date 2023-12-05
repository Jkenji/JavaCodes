class IronSword extends Weapon {
    public IronSword() {
        super("Iron Sword", "HEAVY", 10, new LightWeaponDamageCalculator());
    }
}