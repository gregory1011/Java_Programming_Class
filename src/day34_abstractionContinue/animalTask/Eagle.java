package day34_abstractionContinue.animalTask;

public class Eagle extends Animal implements Flyable, wildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snakes.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle "+ getName() + " can fly anywhere.");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+ getName()+ " is hunting like a predator.");
    }



}
