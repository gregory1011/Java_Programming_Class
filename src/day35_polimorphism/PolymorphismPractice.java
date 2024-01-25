package day35_polimorphism;

import day34_abstractionContinue.animalTask.*;
import day35_polimorphism.transportationTask.*;

import java.net.CacheRequest;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Mike", "Bengal", 'M', 5, "Large", "Orange");
        System.out.println(tiger);
        tiger.eat();
        tiger.drink();
        tiger.sleep();

       //  tiger.hunt();

        Animal  animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black" );
        // animal.fly();
        animal.sleep();
        animal.drink();
        animal.eat();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black" );
        // obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Eagle eagle = null;
        Dolphin dolphin = null;
        Lian lian = null;
        Parrot parrot = null;
        Shark shark = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;


         Flyable[] birds = {eagle, parrot, duck};
         Swimmable[] fishes = {shark, duck, dolphin, };
         wildAnimal[] wildAnimals = {lian, shark, eagle};
         Playable [] friendlyAnimals = {parrot, duck, dog, cat, dolphin};

        // boolean isAnimal = cydeoCar instanceof Animal;
         boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);

        System.out.println("--------------------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2023, 67000);
        System.out.println(car);

        boolean isTesla = car instanceof Tesla;
        System.out.println("isTesla = " + isTesla);

        boolean isAudi = car instanceof Audi;
        System.out.println("isAudi = " + isAudi);

        boolean isElectric = car instanceof Electric;
        System.out.println("isElectric = " + isElectric);

        boolean hasAutoPark = car instanceof AutoPark;
        System.out.println("hasAutoPark = " + hasAutoPark);

        boolean hasAutoPilot = car instanceof AutoPilot;
        System.out.println("hasAutoPilot = " + hasAutoPilot);












    }
}
