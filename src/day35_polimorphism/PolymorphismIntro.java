package day35_polimorphism;

import day34_abstractionContinue.animalTask.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Rita", "English", 'F', 6, "Small", "Brown");

        Tiger tiger = null;
        Eagle eagle = null;
        Lian lian = null;
        Parrot parrot = null;
        Shark shark = null;
        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lian, eagle, parrot, shark, duck};

        Animal animal = lian;






    }
}
