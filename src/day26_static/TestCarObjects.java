package day26_static;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("Toyota", "Supra");
        System.out.println(car2);

        Car car3 = new Car("Lexus", "RX200", 2023);
        System.out.println(car3);

        Car car4 = new Car("Mercedes", "S550", 2021, 90000);
        System.out.println(car4);

        Car car5 = new Car("Honda", "Odyssey", 2015, 14000, "White");
        System.out.println(car5);




    }
}
