package day36_polimorphismContinue;

public class TestEqualMethods {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10);

        System.out.println(circle1 == circle2); // false --> this == checks if memory allocation is same for both objects. // FALSE

        System.out.println(circle1.equals(circle2)); // true -->

        System.out.println(circle1.equals(circle3)); // false

       // System.out.println(circle1.equals("Java")); //  "Invalid Object"

        System.out.println("-----------------------------------------------------------");

        IPhone iPhone1 = new IPhone("Apple", "IPhone 12", "Medium", "Black", 950);
        IPhone iPhone2 = new IPhone("Apple", "IPhone 12", "Medium", "Blue", 950);

        //System.out.println(iPhone1.equals(circle1)); // false

        System.out.println(iPhone1.equals(iPhone2));  // false --> the color of iphone1 is different from the color of iphone2

        iPhone2.setColor("Black");
        System.out.println(iPhone1.equals(iPhone2)); // true

        System.out.println("-----------------------------------------------------------");

        Car car1 = new Car("Tesla Y", "White", 2020, 80000);
        Car car2 = new Car("Tesla Y", "White", 2020, 80000);

        System.out.println(car2.equals(car1));  // true
        car2.setColor("Black");
        car2.getMake();

        System.out.println(car1.equals(car2));  // false --> different calors
    }




}
