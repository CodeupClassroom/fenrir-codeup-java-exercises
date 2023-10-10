package oop_pillars_lectures.CharacterExample;

public abstract class Villain implements CharacterInterface {

    private String name;
    private String evilPlot;

    public Villain(String name, String evilPlot) {
        this.name = name;
        this.evilPlot = evilPlot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvilPlot() {
        return evilPlot;
    }

    public void setEvilPlot(String evilPlot) {
        this.evilPlot = evilPlot;
    }
}
