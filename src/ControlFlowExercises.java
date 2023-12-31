import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner localScanner = new Scanner(System.in);

//        Loop Basics
//
//        While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

// Solution:
//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//
//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.

        //Solutions:

        System.out.println();
        int doWhile = 0;

        do {
            System.out.println(doWhile);
            doWhile += 2;
        } while (doWhile <= 100);

        int doWhile2 = 100;

        do {
            System.out.println(doWhile2);
            doWhile2 -= 5;
        } while (doWhile2 >= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        Solution:
        int doWhile3 = 2;

        do {
            doWhile3 *= doWhile3;
            System.out.println(doWhile3);
        } while (doWhile3 < 65_536);

//        For
//
//        Refactor the previous two exercises to use a for loop instead.

        System.out.println("for loops:");
        for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }

        for (int i = 100; i >= -10 ; i -= 5) {
            System.out.println(i);
        }

        for (long i = 2; i <= 65_536; i *= i) {
            System.out.println(i);
        }



    //Fizzbuzz
        System.out.println("Fizzbuzz Loop:");
        for (int i = 0; i < 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

//        Display a table of powers:

        boolean continueFlag = false;

        do {
            System.out.println("What number would you like to go up to?");
            int userInt = localScanner.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i++) {
                System.out.printf("%6d | %7d | %5d%n", i, i * i, i * i * i);
            }

            System.out.println("Would you like to go again? YES/NO");
            localScanner.nextLine();
            String answer = localScanner.nextLine();

            if (answer.toLowerCase().equals("yes")) {
                continueFlag = true;
            } else {
                continueFlag = false;
            }
        }
        while(continueFlag);

        //    Grades App:

        boolean continueFlagGrade = false;

        do {
            System.out.println("Hello ! please give me your grade (0 - 100)");

            int userGrade = localScanner.nextInt();

            if (userGrade > 88) {
                System.out.println("You got an A");
            } else if (userGrade > 80) {
                System.out.println("You got a B");
            } else if (userGrade > 67) {
                System.out.println("You got a C");
            } else if (userGrade > 60) {
                System.out.println("You got a D");
            } else {
                System.out.println("You need to study more :(");
            }

            System.out.println("Do you have another grade to convert? YES/NO");
            localScanner.nextLine();
            String userAnswer = localScanner.nextLine();

            if (userAnswer.toLowerCase().equals("yes")) {
                continueFlagGrade = true;
            } else {
                continueFlagGrade = false;
            }
        }
        while(continueFlagGrade);

    }




}
