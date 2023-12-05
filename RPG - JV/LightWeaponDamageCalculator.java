public class LightWeaponDamageCalculator implements WeaponDamageCalculator {
    @Override
    public int calculateWeaponDamage(Player player, int baseDamage) {
        int finalHeavyWeaponDamage = baseDamage + Dice.rollD6() + Dice.rollD6() + player.getStrength();
      
        return finalHeavyWeaponDamage;
    }
}