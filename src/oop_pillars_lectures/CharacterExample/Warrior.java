package oop_pillars_lectures.CharacterExample;

public class Warrior extends Character{


    public Warrior(String name, String race) {
        super(name, race);
    }

    @Override
    public String attackAction() {
        return "The warrior strikes with their sword and shield!";
    }

    @Override
    public String defendAction() {
        return "The warrior raises their shield and holds their ground!";
    }

    @Override
    public String specialAction() {
        return "The warrior strikes with their shield and stuns the enemy!";
    }

    public String warriorChant(){
        return "Warrrriorsssss come out to playyyyyyyyyy";
    }
}
