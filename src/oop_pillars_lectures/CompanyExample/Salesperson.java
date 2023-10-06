package oop_pillars_lectures.CompanyExample;

public class Salesperson extends Employee {

    public void workingHard(){
        System.out.println("Selling, making cold calls, smiling and dialing!");
    }
    public Salesperson(String name, String department){
        super(name, department);
    }

}
