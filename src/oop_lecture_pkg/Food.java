package oop_lecture_pkg;

public class Food {

    //An instance of a 'Food' can have what values?

    //Calories, servingSize, ingredients, name

    //What datatypes do I need?
    //Int = cal; all others strings

    public String name;
    public String ingredients;
    public int servingSize;
    public int caloriesTotal;

    //Our static example: numRecipes representing the total num of recipes that are made from this class

    public static int numRecipes;

    public static void main(String[] args) {

        Food.numRecipes = 0;

        //First instance of a Food object named williamsFood
        Food williamsFood = new Food();

        williamsFood.name = "Tacos";

        williamsFood.ingredients = "Meat, tortillas, vegetables, sauce";

        williamsFood.servingSize = 13;

        williamsFood.caloriesTotal = 400;

        numRecipes++;

        System.out.println(williamsFood.name);
        System.out.println(williamsFood.ingredients);
        System.out.println(williamsFood.servingSize);
        System.out.println(williamsFood.caloriesTotal);

        System.out.println("Recipes total so far: " + numRecipes);

        //Second instance of a food object
        Food jessicasFood = new Food();

        jessicasFood.name = "pot roast";
        jessicasFood.ingredients = "Rump roast, potatoes, carrots, celery, beef stock, spices";
        jessicasFood.servingSize = 6;
        jessicasFood.caloriesTotal = 450;

        Food.numRecipes++;

        System.out.println(jessicasFood.name);
        System.out.println(jessicasFood.ingredients);
        System.out.println(jessicasFood.servingSize);
        System.out.println(jessicasFood.caloriesTotal);

        System.out.println("Recipes total so far: " + numRecipes);

    }

}
