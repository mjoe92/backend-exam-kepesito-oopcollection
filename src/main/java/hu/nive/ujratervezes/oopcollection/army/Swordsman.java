package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    public void breakShield() {
        hasShield = false;
    }

    public boolean isHasShield() {
        return hasShield;
    }
}