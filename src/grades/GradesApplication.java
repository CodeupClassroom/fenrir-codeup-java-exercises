package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner localScanner = new Scanner(System.in);
        boolean continueFlag = false;

        Student student1 = new Student("Darwin");
        Student student2 = new Student("Tesla");
        Student student3 = new Student("Oppenheimer");
        Student student4 = new Student("Curie");


        student1.addGrade(90);
        student2.addGrade(90);
        student3.addGrade(90);
        student4.addGrade(90);

        student1.addGrade(66);
        student2.addGrade(72);
        student3.addGrade(85);
        student4.addGrade(99);

        student1.addGrade(12);
        student2.addGrade(78);
        student3.addGrade(75);
        student4.addGrade(65);

        students.put("darwieBb", student1);
        students.put("ACdc2023", student2);
        students.put("nuclearboiz", student3);
        students.put("girlboss2020", student4);

        System.out.println("WELCOME : : TO THE GRADE APPLICATION");

        do {
            System.out.println("~h e r e   a r e   o u r   a v a i l a b l e   u s e r s~");

            for (String username : students.keySet()) {
                System.out.printf(" |%s| ", username);
            }


//            for (int i = 0; i < students.keySet().size() ; i++) {
//
//                System.out.printf(" |%s| ", students.keySet().toArray()[i]);
//            }

            System.out.printf("%n%n");
            System.out.println("WHAT STUDENT INFORMATION DO YOU WISH FOR:");
            String searchToken = localScanner.nextLine();

            if (students.keySet().contains(searchToken)) {
                Student foundStudent = students.get(searchToken);
                System.out.printf("Name: %s - GitHub Username: %s%n" +
                        "Current Average: %.2f%n", foundStudent.getName(), searchToken, foundStudent.getGradeAverage());
            } else {
                System.out.printf("%s not found%n", searchToken);
            }

            System.out.println("MORE STUDENTS TO SEARCH? > Y/N <");
            String userAnswer = localScanner.nextLine();

            if(userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")){
                continueFlag = true;
            } else {
                continueFlag = false;
            }

        } while (continueFlag);
    }
}
