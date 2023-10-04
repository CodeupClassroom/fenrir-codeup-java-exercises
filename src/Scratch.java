import oop_lecture_pkg.Car;

public class Scratch {

    public static void main(String[] args) {
//        double piPi = 3.00;
//
//        System.out.println(piPi);

        Car myCar = new Car();

        myCar.setVinNum("GiveMeAVinNum");

        System.out.println(myCar.getVinNum());

        System.out.println(myCar.vinNum);
    }

}
