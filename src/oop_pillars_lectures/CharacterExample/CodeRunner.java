package oop_pillars_lectures.CharacterExample;

public class CodeRunner {

    public static void main(String[] args) {

        System.out.println("Welcome to the Inn! Looks like a hero is coming in to say hello:");

        Warrior cainnechTheWarrior = new Warrior("Cainnech", "Half-orc");

        Wizard gilliamTheWizard = new Wizard("Gilliam", "Half-Elf");

        RedWizard rojoWizard = new RedWizard("Peanut the Wizard", "Catkin");

        System.out.printf("Hail, here arrives %s the %s%n", cainnechTheWarrior.getName(), cainnechTheWarrior.getRace());

        System.out.println("Oh no - a goblin snuck in the Inn!");
        System.out.println(cainnechTheWarrior.attackAction());

        System.out.printf("%s the %s wizard attacks and says '%s'%n", gilliamTheWizard.getName(), gilliamTheWizard.getRace(), gilliamTheWizard.specialAction());

        System.out.println("Cainnech follows up: " + cainnechTheWarrior.warriorChant());

        System.out.printf("%s uses her red magic: %s%n", rojoWizard.getName(), rojoWizard.attackAction());

        TowerVillain mojoJojo = new TowerVillain("Mojo Jojo", "Steal Chemical X");

        System.out.println(mojoJojo.getEvilPlot());
        System.out.println(mojoJojo.specialAction());

    }

}

