package day35_polimorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPilot{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    @Override
    public void charge() {
        System.out.println();
    }

    @Override
    public void transportPeople() {
        System.out.println();
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting");
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla has autoDrive feature.");
    }







}
