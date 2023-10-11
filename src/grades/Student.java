package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){

        double bucket = 0.0;

        for(Integer grade : this.grades){

            bucket+= (double) grade;
        }


        return bucket / this.grades.size();
    }
}
