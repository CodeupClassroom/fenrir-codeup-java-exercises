import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {

    public static void main(String[] args) {
        //String Definition
        String myString = "Hello Fenrir";

//        System.out.println(myString);

//        int int1 = 1;
//
//        int int2 = 1;
//
//        System.out.println(int1 == int2);

//        String mySecondString = "Hello Fenrir";

        String mySecondString = new String("Hello Fenrir");

//        System.out.println(myString.equals(mySecondString));


        //String Immutability

        String name = "Fenrir";
//        System.out.println(name);

        String lastName = "Class";
//        System.out.println(lastName);

        name = "Codeup";

        String fullName = name + " " + lastName;

//        System.out.println(fullName);
//
//        System.out.println(name);
//
//        System.out.println(lastName);


        //String Comparison

        //.equals method

        String pumpkin = "pumpkin";

        String pie = "pie";
//        pie = "pumpkin";

//        System.out.println(pie.equals(pumpkin));

        //.equalsIgnoreCase method

        String yelling = "HELLO";

        String quietly = "hello";

//        System.out.println(yelling.equalsIgnoreCase(quietly));


        //.startsWith & .endsWith methods
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Type in the letter I");
//        String input = scanner.next();

        String ironMan = "Iron Man";
//        System.out.println(ironMan.toLowerCase().startsWith(input));

//        System.out.println(ironMan.endsWith("Mann"));


        //.charAt method
//        System.out.println(ironMan.charAt(ironMan.length() -1));

//        System.out.println(ironMan.charAt(ironMan.indexOf("M")));


        //.replace method
        String ironGuy = ironMan.replace("Man", "Guy");

        System.out.println(ironGuy);

        System.out.println(ironMan);

        String catwoman = "Catwoman";


        //.substring method
        System.out.println(catwoman.substring(3, 6));

        String cat = catwoman.substring(0, 3);

        System.out.println(cat);

        String woman = catwoman.substring(3);

        System.out.println(woman);


        //.trim method
        String ugly = "       Hello        there       ";
        System.out.println(ugly.trim());


        //method chaining
        String word = "bat";

        String pigLatinWord = word
                        .trim()
                        .toLowerCase()
                        .substring(1)
                        .concat(word.substring(0, 1).toLowerCase())
                        .concat("ay");

        System.out.printf("Original Word: %s", word);
        System.out.println();
        System.out.println(pigLatinWord);
    }
}
