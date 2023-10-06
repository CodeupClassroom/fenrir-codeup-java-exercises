package oop_pillars_lectures.CompanyExample;

public class Company {

    public static void main(String[] args) {
        //I've got a brand new accountant starting

        Accountant accountBot = new Accountant("accountatron2000", "Accounting", true, "Six months contract to April");

        System.out.printf("Hey who started today? The new employees name is %s and they work in %s - real quick, you went to school for math, right? %b%n", accountBot.getName(), accountBot.getDepartment(), accountBot.collegeDegree);

        accountBot.workingHard();

        Employee tempBot = new Employee("tempBot1010", "Floating between departments");

        tempBot.workingHard();

        Salesperson salesBot = new Salesperson("Sellotron", "Sales");

        salesBot.workingHard();

        //"piglatin" < y tho

    }
}
