public class HeavyWeaponDamageCalculator implements WeaponDamageCalculator {
    @Override
    public int calculateWeaponDamage(Player player, int baseDamage) {
        int finalHeavyWeaponDamage = baseDamage + Dice.rollD12() +  (int)(1.5 * player.getStrength());
      
        return finalHeavyWeaponDamage;
    }
}