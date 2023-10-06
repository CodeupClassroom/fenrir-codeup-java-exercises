package oop_pillars_lectures.ClassExample;

public class School {

    public static void main(String[] args) {
        System.out.println("Welcome to kennyUp");

        WebDevelopment firstCohort = new WebDevelopment("Fenrir", 12);

        System.out.printf("Hey welcome to kennyUp %s cohort - there are %d of you %n", firstCohort.cohortName, firstCohort.numStudents);

        firstCohort.curriculum();

        DataScience firstDataScienceCohort = new DataScience("DataPeople", 9);

        System.out.printf("Hey welcome to kennyUp %s cohort - there are %d of you %n", firstDataScienceCohort.cohortName, firstDataScienceCohort.numStudents);

        firstDataScienceCohort.curriculum();


    }
}
