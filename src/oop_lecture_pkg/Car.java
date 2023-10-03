package oop_lecture_pkg;

public class Car {
    //Classes let us define custom objects - imagine it as a blueprint, template, or character sheet to be followed

    //Classes have fields - fields are variables (properties of WHAT a class is) and methods (ACTIONS/BEHAVIORS a class can do)

    //First example: Make; model, year, honk() [model + make + " honks its horn!"] fields

    public String make;
    public String model;
    public int year;

    public void honkHorn(){
        System.out.printf("%s %s honks its horn%n", make, model);
    }

    //Static - an instance of a class (an object) can have individual and unique values to their fields. Non-unique fields are flagged with the 'static' keyword.

    //Let's look at the Math object
    double piExample = Math.PI; //Command click 'Math' to see the entire object, 'PI' to see the property of the object

    //We usually start using the Math object to think about static since we don't make a unique instance of Math - there is only a global thing CALLED Math that would never have a personal, unique copy of it made (Kenny's Math vs Gilly's Math vs. Gonzo's Math < that doesn't make sense! There is only Math!"

    //Second example: static carInventoryCount property.

    public static int carInventoryCount;


    //Constructors - all constructors are methods, all methods can be overloaded.

    //Third example: car constructor method that auto-increments static carInventoryCount when each car is made

    //Fourth example: overloading constructor to allow for missing model / year

    //This - think of it as saying ME, MYSELF, THIS object.

    //Fifth example: logCarInfo()

    //Visibility - let's set up a private String that is carOwner and set up a small application running class called dealershipApp to see if we can access info in the other class.

    public static void main(String[] args) {
//        I want to make a car - how do? DataType variableName = new dataType();

//        Making a car without any details assigned to it
        Car kennysCar = new Car();
//        Let's assign the right values to kenny's car
        kennysCar.make = "Chevrolet";

        kennysCar.model = "Silverado";

        kennysCar.year = 2017;

        System.out.printf("Here's some information about a car: %s %s of the %d year%n", kennysCar.make, kennysCar.model, kennysCar.year);

//        Toyota Camry 2021
        Car gillysCar = new Car();

        gillysCar.make = "Toyota";
        gillysCar.model = "Camry";
        gillysCar.year = 2021;

        System.out.printf("Here's some information about a car: %s %s of the %d year%n", gillysCar.make, gillysCar.model, gillysCar.year);

//        Memory refs:
        System.out.println(gillysCar);
        System.out.println(kennysCar);
//        Let's go honking! Go spurs go!
        gillysCar.honkHorn();
        kennysCar.honkHorn();

//        Look: Cant even TRY to make my own version of Math! It's locked down! Whoa
//        Math myMath = new Math();

        Car.carInventoryCount = 0;

//        "Okay Gonzo! Sir, we have TWO NEW CARS ON THE LOT - kennysCar and gillysCar"
//          "ADD THEM TO THE INVENTORY" gonzo says politely as usual

        carInventoryCount++;

        System.out.println("What is our inventory: " + carInventoryCount);

        carInventoryCount++;

        System.out.println("What is our inventory: " + carInventoryCount);


    }

}
