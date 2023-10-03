public class MethodsExercises {

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

    public static void main(String[] args) {

        System.out.println(addition(2, 4));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplaction(10, 3));
        System.out.println(division(12, 3));
        System.out.println(modulo(15, 4));

        System.out.println(multiplyLoop(4));
        System.out.println(recursionMultiply(4, 4, 0));
        System.out.println(recursionMultiply(10, 10, 0));
    }



}
