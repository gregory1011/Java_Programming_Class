package day29_inheritance.animalTask;

import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day29_inheritance.animalTask.Tiger;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'M', 4, "Large", "White");
        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Rita", "Good", 'F', 3, "Small", "Black");
        System.out.println(cat1);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Mike", "Bengal", 'M', 5, "Big", "Blue");
        System.out.println(tiger1);

        System.out.println("---------------------------");

        dog1.sleep();
        dog1.drink();
        dog1.eat();

        dog1.bark();

        System.out.println("---------------------------");

        cat1.eat();
        cat1.drink();
        cat1.sleep();

        cat1.meow();

        System.out.println("---------------------------");

        tiger1.drink();
        tiger1.eat();
        tiger1.sleep();

        tiger1.hunt();

        System.out.println("---------------------------");

/*
        System.out.println(dog1.name);
        System.out.println(dog1.color);

        dog1.gender = 'K';
        dog1.age = 12;

 */


        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        dog1.setGender('M');
        dog1.setAge(4);
        System.out.println(dog1);




    }



}
