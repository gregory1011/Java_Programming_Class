package day27_accessModifiers;

public class TestNestedCarClassObjects {
    public static void main(String[] args) {

        Car object1 = new Car();  // car object, we call it from Car class
        Car.CarEngine object2 = object1.new CarEngine(); // CarEngine object, we call it through car object from Car class

      Car.StaticInnerClass object3 = new Car.StaticInnerClass(); // static

    }
}
