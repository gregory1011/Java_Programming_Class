package day31_inheritance.animal_methodOverriding;

import java.util.Scanner;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ getName() + " is eating cat food.");
        System.out.println("Can my cat fly?");
        Scanner input = new Scanner(System.in);
        System.out.println("Answer yes or no?");
        input.next();
        System.out.println("Thank you, my cat cannot fly");
        input.close();
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+ getName() + " is sleeping like a baby.");
        Scanner input = new Scanner(System.in);
        System.out.println(" Is your can fighting? Yes or No");
        input.next();
        System.out.println("Thank you, your can is calm like a baby.");
    }


    public void scratch(){
        System.out.println("Cat "+ getName()+ " is scratching sofa");
    }


}
