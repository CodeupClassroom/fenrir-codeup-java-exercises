import java.util.Scanner;

public class MethodsExercises {
    public static Scanner localScanner = new Scanner(System.in);
    public static int addition(int x, int y){

        return x + y;
    }
    public static int subtraction(int x, int y){

        return x - y;
    }
    public static int multiplication(int x, int y){

        return x * y;
    }
    public static int division(int x, int y){

        return x / y;
    }

    public static int modulo(int x, int y){

        return x % y;
    }

    //Multiply without using operator

    public static int multiplyLoop(int x, int y){
        int bucket = 0;

        for (int i = 0; i < y; i++) {
            bucket += x;
        }

        return bucket;
    }

    // recursion multiply bonus

    public static int recursionMultiply(int x, int y, int bucket){

        if(y == 0){
            return bucket;
        }

        bucket += x;

        y--;

        return recursionMultiply(x, y, bucket);
    }

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

    }



}
