package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Jora");

        Person person2 = new Person("Romeo", 'M');

        Person person3 = new Person("Bob", 32);

        Person person4 = new Person("Daniel", "French");

        Person person5 = new Person("Lily", 43, 'F', "Romanian");

        Person person6 = new Person("Lucy", 23, 'F');

        person5.name = "Mark";
        person4.age = 24;
        person6.name = "Greg";
        person6.gender = 'M';
        Person.planet = "Jupiter";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person3.eat("Pizza");
        person5.drink("Fanta");
        person6.drink("Beer");





    }
}
