import java.util.Scanner;

public class MethodsExercises {
    public static Scanner localScanner = new Scanner(System.in);
    public static int addition(int x, int y){

        return x + y;
    }
    public static int subtraction(int x, int y){

        return x - y;
    }
    public static int multiplaction(int x, int y){

        return x * y;
    }
    public static int division(int x, int y){

        return x / y;
    }

    public static int modulo(int x, int y){

        return x % y;
    }

    //Multiply without using operator

    public static int multiplyLoop(int x){
        int bucket = 0;

        for (int i = 0; i < x; i++) {
            bucket += x;
        }

        return bucket;
    }

    // recursion multiply bonus

    public static int recursionMultiply(int operand, int count, int bucket){

        if(count == 0){
            return bucket;
        }

        bucket += operand;

        count--;

        return recursionMultiply(operand, count, bucket);
    }

//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//The method signature should look like this:
//public static int getInteger(int min, int max);
//and is used like this:
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!

    public static int getInteger(int min, int max){
        System.out.printf("Please enter a number between %d and %d%n", min, max);

        int userIntAnswer = localScanner.nextInt();

        if(userIntAnswer < min || userIntAnswer > max){
            System.out.println("Incorrect input detected - please try again");

            return getInteger(min, max);
        }

        return userIntAnswer;
    }

    public static void main(String[] args) {

        System.out.println(addition(2, 4));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplaction(10, 3));
        System.out.println(division(12, 3));
        System.out.println(modulo(15, 4));

        System.out.println(multiplyLoop(4));
        System.out.println(recursionMultiply(4, 4, 0));
        System.out.println(recursionMultiply(10, 10, 0));

        System.out.println(getInteger(40, 45));
    }



}
