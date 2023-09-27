public class SyntaxLecture {

    public String name;

    public static void main(String[] args) {
//Let you add a comment: sysOut println ~
        System.out.println("Semicolons plz");

        //Strictly typed - identify the data types as we go along
        //dataType varName = value

        String myString = "Using \t double quotes plz \n newline";

        char myChar = 'A';

        int intVariable = 555;

        System.out.println(myString);
        System.out.println("This adds");
        System.out.println("A new line after each print out");
        System.out.print("On the other hand");
        System.out.print(" this last two will be on the same line because we are not adding a newline character automagically");

        System.out.println();

//        Sloppy code: dont do it!
        byte varName; char varName2 = 1;

//        Up til now we have been using reassignable variables - dataType varName

        // Constant: keyword of FINAL in the syntax
        // final dataType varName < const equivalent

        final String API_URL = "https://www.apiurl.com/goGetStuff/?id=";
//        CTE compile time error, cant reassign a final! what are you doin??
//        API_URL = "differentUrl";

    int willsFav = 47;

    System.out.println(willsFav);

//    willsFav++;

    System.out.println(willsFav++);

    System.out.println(willsFav);

//    Java is cool with going a size or sizes UP in data type

        byte myByte = 3;
        short myShort = myByte;

//        If we try to go 'a size down'

        int myInt = 500;
//          Explicitly saying CHANGE MY DATATYPE from A to B even if a loss of data occurs
        short myOtherShort = (short) myInt;

        double myChangeFromRestaurant = 5.55;

        System.out.println(myChangeFromRestaurant);

        int whatHappensToMyChange = (int) myChangeFromRestaurant;

        System.out.println(whatHappensToMyChange);

        System.out.println(myOtherShort);
    }
//        Belt out a new comment


}