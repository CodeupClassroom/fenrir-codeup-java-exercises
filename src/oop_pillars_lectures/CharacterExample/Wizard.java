package oop_pillars_lectures.CharacterExample;

public class Wizard extends Character {

    public Wizard(String name, String race) {
        super(name, race);
    }

    @Override
    public String attackAction() {
        return "Magic missile! Magic missile! I'm outta mana!";
    }

    @Override
    public String defendAction() {
        return "Magic shield interrupts the incoming attack!";
    }

    @Override
    public String specialAction() {
        return "Summoning my feral cat army to attack >:D";
    }

}
