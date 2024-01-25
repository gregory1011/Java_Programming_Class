package day17_CustomClass;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carSet("Toyota", "Highlander", 2017, "SUV", "Gas", "Auto");

        System.out.println(car1);
        car1.testDrive();

    }
}
