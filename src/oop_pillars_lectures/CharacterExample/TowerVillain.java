package oop_pillars_lectures.CharacterExample;

public class TowerVillain extends Villain {

    public TowerVillain(String name, String evilPlot) {
        super(name, evilPlot);
    }

    @Override
    public String attackAction() {
        return "Nefarious attack";
    }

    @Override
    public String defendAction() {
        return "Henchmen jump in front to protect me!";
    }

    @Override
    public String specialAction() {
        return "An evil-y laugh";
    }
}
