package oop_pillars_lectures.CharacterExample;

public class RedWizard extends Wizard{
    public RedWizard(String name, String race) {
        super(name, race);
    }

    public String attackAction() {
        return "Casting stolen magic from the monsters - Pow!";
    }




}
