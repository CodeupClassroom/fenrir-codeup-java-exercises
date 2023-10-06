package oop_pillars_lectures.CompanyExample;

import java.util.Arrays;

public class Employee {

    public String name;
    public String department;

    public String contractedWorkers;

    //A method to represent an employee working
    public void workingHard(){
        System.out.println("An employee is working hard");
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String department, String contractedWorkers) {
        this.name = name;
        this.department = department;
        this.contractedWorkers = contractedWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        //Remember: What do you want for lunch?
        //A PIE
        //[A]bstraction; [P]olymorphism; [I]nheritance; [E]ncapsulation

        //What is inheritance in Java?
        //A way to extend FROM a superclass TO a subclass
        //This allows: access to the superclasses' fields (properties and methods) in the inheriting class (subclass)

    }
}
