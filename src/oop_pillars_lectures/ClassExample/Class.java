package oop_pillars_lectures.ClassExample;

public class Class {

    //All classes have cohortNames
    //All classes have numStudents
    //subclasses have specific programs ("Web dev", "Data Science", "Cloud Academy")
    //Subclasses would have a curriculum() < describes what is being studied

    public String cohortName;
    public int numStudents;
    public void curriculum(){
        System.out.println("Studying something generic");
    }

    public Class(String cohortName, int numStudents) {
        this.cohortName = cohortName;
        this.numStudents = numStudents;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }
}

