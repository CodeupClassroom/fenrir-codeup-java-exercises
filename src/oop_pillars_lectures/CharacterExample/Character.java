package oop_pillars_lectures.CharacterExample;

public abstract class Character implements CharacterInterface {
    private String name;
    private String race;

//    public abstract String attackAction();
//    public abstract String defendAction();
//    public abstract String specialAction();


    public void fleeBattleAction(){
        System.out.println("Running away from battle");
    };

    public Character(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
