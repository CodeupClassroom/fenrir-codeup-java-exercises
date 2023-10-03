public class MethodsLecture {
    public static void printNum(int input){

        System.out.println(input);

    }

    //Float version of printNum

    public static void printNum(float input){
        System.out.println(input);
    }

    //Dbl version

    public static void printNum(double input){
        System.out.println(input);
    }

    public static int addTwo(int input){
        return input + 2;
    }

    public static double addTwo(double input){
        return input + 2;
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    //method about cars

    public static void carInfo(String model, String make, int year, String color){
        System.out.printf("This is a %s %s of the %d year and it is %s color%n", model, make, year, color);
    }

    public static void carInfo(String model, String make, int year){
        carInfo(model, make, year, "unknown");
    }

    public static void carInfo(String make, int year){
        System.out.printf("This is a %s of the %d year%n", make, year);
    }
    public static void main(String[] args) {

//        Visibility static returnType methodName (optionalParams, . . . params){
//        these brackets are the method body
//        code goes here
//        }
//
//        printNum(5); //Int literal
//        printNum((float) 5.5); //Dbl cast float
//        printNum(10.5); //Dbl literal
//        System.out.println(addTwo(2));
//        System.out.println(addTwo(7.3));

        carInfo("Chevrolet", "Silverado", 2017, "Weird blue");

        carInfo("Jeep", "Wrangler", 2017);

        carInfo("Dodge", 2023);

    }

}
