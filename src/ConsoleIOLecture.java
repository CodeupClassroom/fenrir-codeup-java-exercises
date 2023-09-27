import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {

        String cohortName = "Ragnarock";

//        System.out.printf("Hey, this is the %s cohort. %n One instructor is %s from the cohort and there are %d students in it", "Gilly", 12);

        //Imported the recipe for Scanner - now we need to cook one up

        //Tech lingo: instantiating an object

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What kind of coffee should we have?");
//        .next() grabs the next token up to the delimiter (the next. . thing up to the white space)
        String userAnswer = myScanner.next();

        System.out.println(userAnswer + "? Sounds great, I'd love a cup");
    }


}
