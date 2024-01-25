package day34_abstractionContinue.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName() + " is eating worms.");
    }

    @Override
    public void play() {
        System.out.println("Duck "+ getName()+ " is friendly animal.");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+ getName() + " can fly anywhere.");
    }

    @Override
    public void swim() {
        System.out.println("Duck "+ getName() + " can swim in the lakes.");

    }
}
