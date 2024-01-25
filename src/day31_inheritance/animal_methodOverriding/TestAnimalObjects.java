package day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Rita", "Wild", 'F', 3, "Small", "Grey");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lian lion = new Lian("Simba", "Safari Lian", 'M', 6, "Large", "Gold", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4 , "medium", "Black");

        System.out.println(lion);
        System.out.println(eagle);
        System.out.println(dog);
        System.out.println(cat);

        System.out.println("--------------------------------------------------------------------------------------");

        lion.eat();
       // cat.eat();
        dog.eat();
        eagle.eat();
       // cat.eat();

        System.out.println("--------------------------------");

      //  cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();




    }
}
