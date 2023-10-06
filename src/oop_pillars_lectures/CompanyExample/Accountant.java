package oop_pillars_lectures.CompanyExample;

public class Accountant extends Employee {

    boolean collegeDegree;
    public void workingHard(){
        System.out.println("This accountant is processing numbers and mathing");
    }
    public Accountant(String name, String department, boolean collegeDegree, String contractTerms) {
        super(name, department, contractTerms);

        this.collegeDegree = collegeDegree;

    }
}
