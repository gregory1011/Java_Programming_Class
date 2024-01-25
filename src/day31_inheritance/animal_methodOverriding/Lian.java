package day31_inheritance.animal_methodOverriding;

public class Lian extends Animal{

    private boolean isAfricanLian;

    public Lian(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLian) {
        super(name, breed, gender, age, size, color);
        setAfricanLian(isAfricanLian);
    }

    public boolean isAfricanLian() {
        return isAfricanLian;
    }

    public void setAfricanLian(boolean africanLian) {
        isAfricanLian = africanLian;
    }

    @Override
    public void eat() {
        System.out.println("Lian "+ getName() + " is eating pork meet.");
    }


    public void roar() {
        System.out.println("Lian "+ getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("'}", "") +
                ", african lian='" + isAfricanLian + '\'' +
                '}';
    }



}
