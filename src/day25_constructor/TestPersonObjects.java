package day25_constructor;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("John", 33, 'M', LocalDate.of(2000, 3, 23), true, true);
        System.out.println(person1);
        person1.eat("Oranges");
        person1.drink("Beer");
        person1.sleeping();

        Person person2 = new Person("Victoria", 23, 'F', LocalDate.of(1988, 5, 15),true,false);
        System.out.println(person2);
        person1.sleeping();
        person2.eat("Grapes");
        person2.drink("Milk");

        Person person3 = new Person("Becali", 55, 'M', LocalDate.of(1975, 6, 24), true, true);
        System.out.println(person3);
        person3.drink("Water");
        person3.eat("Salad");
        person3.sleeping();

        Person person4 = new Person("Jora", 21, 'M', LocalDate.of(2002, 3, 4), false, false);
        System.out.println(person4);
        person4.sleeping();
        person4.drink("Juice");;
        person4.eat("Meat");

        Person person5 = new Person("Alina", 25, 'F', LocalDate.of(1991, 4, 6), true, false);
        System.out.println(person5);
        person5.sleeping();
        person5.drink("Tea");
        person5.eat("Watermelon");







    }
}
