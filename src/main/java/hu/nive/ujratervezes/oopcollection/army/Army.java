package hu.nive.ujratervezes.oopcollection.army;

import java.util.LinkedList;
import java.util.List;

public class Army {

    private final List<MilitaryUnit> army;

    public Army() {
        this.army = new LinkedList<>();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(unit -> unit.sufferDamage(damage));
        army.removeIf(unit -> unit.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    public int getArmySize() {
        return army.size();
    }
}