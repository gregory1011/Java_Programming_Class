package day34_abstractionContinue.animalTask;

public class Lian extends Animal implements wildAnimal{


    public Lian(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println("Lian "+ getName()+ " is eating buffalo");
    }


    @Override
    public void hunt() {
        System.out.println("Lian "+ getName()+ " is hunting in safari.");
    }
}
