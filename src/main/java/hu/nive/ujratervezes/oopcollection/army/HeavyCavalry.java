package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private static boolean isFirst = true;

    public HeavyCavalry() {
        super(150, 20, true);
        isFirst = true;
    }

    public boolean getIsFirst() {
        return isFirst;
    }

    public static void nextRow() {
        isFirst = false;
    }

}