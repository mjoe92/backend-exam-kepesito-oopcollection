package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public MilitaryUnit(int hitPoints, int damage, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        if (this instanceof HeavyCavalry && ((HeavyCavalry) this).getIsFirst()) {
            HeavyCavalry.nextRow();
            return 3 * damage;
        }
        return damage;
    }

    public int sufferDamage(int damage) {
        int suffer = damage;
        if (this instanceof Swordsman && ((Swordsman) this).isHasShield()) {
            suffer = 0;
            breakShield();
        } else if (isHasArmor()) {
            suffer = damage / 2;
        }
        hitPoints -= suffer;
        return hitPoints;
    }

    public void breakShield() {
        hasArmor = false;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }
}
