package day34_abstractionContinue.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    @Override
    public void eat() {
        System.out.println("Delphin "+ getName() + " is fish.");
    }

    @Override
    public void play() {
        System.out.println("Delphin "+ getName()+ " is friendly animal.");
    }

    @Override
    public void swim() {
        System.out.println("Delphin "+ getName() + " can swim fast under the water.");
    }


}
