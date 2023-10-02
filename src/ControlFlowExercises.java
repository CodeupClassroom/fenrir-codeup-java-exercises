public class ControlFlowExercises {

    public static void main(String[] args) {
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


    }

}
