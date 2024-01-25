package day17_CustomClass;

public class Dog {
    public String name, breed, size, color;// instance variable
    public char gender;
    public int age;

    public void setInfo (String name, String breed, char gender, int age, String size, String color){
        this.name = name;  // "this.name" is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    } // this method can help us to set all the information of the dog at once


    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
