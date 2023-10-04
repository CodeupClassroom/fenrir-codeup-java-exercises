package warm_ups;

public class Clothing {

        public String clothingType; //Pants shoes shirt coat?

        public String color; //Plaid pattern, solid, specific color

        public String size; //XL, XXL, "Size 42"

    public static void main(String[] args) {

        //Instantiate two objects..
        //DataType variableName = new DataType();

        Clothing kensShirt = new Clothing();

        kensShirt.clothingType = "Graphic T-Shirt";
        System.out.println(kensShirt.clothingType);

        kensShirt.size = "XL";
        kensShirt.color = "Gray with company logo";

        System.out.printf("I'm wearing a %s that is the %s size and is %s color%n", kensShirt.clothingType, kensShirt.size, kensShirt.color);

        Clothing kensPants = new Clothing();

        kensPants.clothingType = "Khaki style pant";
        kensPants.color = "Gray";
        kensPants.size = "40 x 32";

        System.out.printf("I'm wearing a %s that is the %s size and is %s color%n", kensPants.clothingType, kensPants.size, kensPants.color);

    }
}
