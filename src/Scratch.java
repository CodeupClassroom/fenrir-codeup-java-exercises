import oop_first_lecture.Car;

import java.util.ArrayList;

public class Scratch {

    public static void main(String[] args) {
//        double piPi = 3.00;
//
//        System.out.println(piPi);

        Car myCar = new Car();

        myCar.setVinNum("GiveMeAVinNum");

        System.out.println(myCar.getVinNum());


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        ArrayList<Integer> collatedList = new ArrayList<>();


        list1.add(90);
        list2.add(90);
        list3.add(90);

        list1.add(80);
        list2.add(90);
        list3.add(70);

        list1.add(15);
        list2.add(50);
        list3.add(89);

        list1.add(92);
        list2.add(78);
        list3.add(66);


        collatedList.addAll(list1);
        collatedList.addAll(list2);
        collatedList.addAll(list3);

        System.out.println(collatedList);

//        System.out.println(myCar.vinNum);
    }

}
