import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {

        // ArrayLists - These data structures should remind us more of Arrays in JS

        //ArrayLists == 1. All objects, 2. All same type

        //Instead of a helper class(Arrays.doMethod()); ArrayLists come with methods to assist us.

        // .size: returns the number of elements in the array
        // .add: add an element to the collection (optionally) at a specified index
        // .get: return the element at the specified index
        // .indexOf: return the first found index of the given item, or -1 if not found

        //ArrayList of Strings representing Pokemon~

        ArrayList<String> pokemonList = new ArrayList<>();

        pokemonList.add("Charmander");

        pokemonList.add("Pikachu");

        pokemonList.add("Abra");

        System.out.println(pokemonList);

        System.out.println("What size is my ArrayList right now?");

        System.out.println(pokemonList.size());

        pokemonList.add(2, "Kadabra");

        System.out.println("What happened to our ArrayList at Index 2?");
        System.out.println(pokemonList);

        System.out.println("Here's a pokemon from my list:");
        System.out.println(pokemonList.get(2));

        pokemonList.set(0, "Charizard");

        System.out.println(pokemonList);

        pokemonList.add("Charizard");

        System.out.println("IndexOf vs LastIndexOf - working with 'Charizard'");
        System.out.println(pokemonList);
        System.out.println(pokemonList.indexOf("Charizard"));
        System.out.println(pokemonList.lastIndexOf("Charizard"));

//        Let's remove Charizard - feeding two Charizards is expensive

        pokemonList.remove(4);
        pokemonList.remove("Abra");
        for(String element : pokemonList){
            System.out.println("Here's a pokemon from our list: " + element);
        }

        //Okay: We saw overloaded remove, we used an enhanced for loop, we used .set() to replace a specific index - let's take a look at our last couple methods

        System.out.println(pokemonList.contains("Blue Eyes White Dragon"));
        System.out.println(pokemonList.contains("Pikachu"));

        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println("Now: First, is our empty list empty(T/F); second, is our pokemonList empty (T/F):");
        System.out.println(emptyList.isEmpty());

        System.out.println(pokemonList.isEmpty());

        //HashMaps

        //A data structure to. .  store [K]ey : [V]alue pairs!

        //Key ; value: "ken2cool", "pw1234"
        //"lang", "en"
        //"lang", "es"
        // Key < > Value

        //We had an idea: CatOwner : CatName [k : v]
        //"Kenny", "Peanut"
        //"Kenny", "Pinch"
        //"Kaylee", "Clarence"
        //"Jessica", "Cali"

        HashMap<String, String> catOwnersToCats = new HashMap<>();

        catOwnersToCats.put("Kenny", "Peanut");

        System.out.println(catOwnersToCats);

        catOwnersToCats.put("Jessica", "Cali");

        System.out.println(catOwnersToCats);

        System.out.println("Hey - what is the value of the key 'Kenny'");
        System.out.println(catOwnersToCats.get("Kenny"));

        System.out.println(catOwnersToCats.get("Gilly"));

        System.out.println(catOwnersToCats.getOrDefault("Gilly", "No cat found!"));
        System.out.println(catOwnersToCats.getOrDefault("Jessica", "No cat found!"));

        //Scenario: I do not want to UPDATE the KEY; I want to only ADD a new key - value pair

        //"Did I find a key of 'Kenny'? If so, DO NADA. If not, ADD K - V pair"
        catOwnersToCats.putIfAbsent("Kenny", "Peanut");

        //No matter what. . have a key-value pair like this (CAN OVERWRITeEe)
        catOwnersToCats.put("Kenny", "Pinch");

        System.out.println(catOwnersToCats);

        System.out.println(catOwnersToCats.containsKey("Person Who Dislikes Cats"));
        System.out.println(catOwnersToCats.containsKey("Kenny"));

        System.out.println(catOwnersToCats.containsValue("Fenix the corgi"));
        System.out.println(catOwnersToCats.containsValue("Cali"));

        System.out.println(catOwnersToCats.put("EvilCatGuyFromDocumentary", "An Innocent Cat"));

        System.out.println(catOwnersToCats);

        //Let's get rid of this evil cat dude

        catOwnersToCats.remove("EvilCatGuyFromDocumentary");
        System.out.println("Remove functionality example:");
        System.out.println(catOwnersToCats);


        //Clear it ! And do a isEmpty check to make sure we emptied our HashMap

        catOwnersToCats.clear();

        System.out.println("Did we empty our HM<S,S>?");
        System.out.println(catOwnersToCats.isEmpty());
    }

}
