import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println("What is the radius of your circle, <USER>?");

        double userRadius = myInput.getDouble();

        Circle userCircle = new Circle(userRadius);

        System.out.printf("Your circle has a radius of %f, a circumference of %f, and a area of %f", userCircle.getRadius(), userCircle.getCircumference(), userCircle.getArea());
    }

}
