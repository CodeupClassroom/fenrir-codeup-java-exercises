package oop_pillars_lectures.ClassExample;

public class WebDevelopment extends Class {
    public WebDevelopment(String cohortName, int numStudents) {
        super(cohortName, numStudents);
    }

    public void curriculum(){
        System.out.println("Working on front end, back end, and deployment topics");
    }
}
