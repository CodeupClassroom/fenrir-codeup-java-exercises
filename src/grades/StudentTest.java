package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student kennyH = new Student("Kenny");

        kennyH.addGrade(100);
        kennyH.addGrade(90);
        kennyH.addGrade(80);
        kennyH.addGrade(55);
        kennyH.addGrade(77);
        kennyH.addGrade(91);
        kennyH.addGrade(76);


        System.out.println(kennyH.getGradeAverage());

    }
}
