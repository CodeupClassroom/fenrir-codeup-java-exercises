package oop_pillars_lectures.BikePolyExample;

public class BMX extends Bike {

    public String suspension;

    public BMX(String suspension) {
        super();
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    void tellMeAboutBike(){
        System.out.println("This is a BMX bike, doing tricks, wheelies, jumping, grinding on rails, being cool");
    }
}
