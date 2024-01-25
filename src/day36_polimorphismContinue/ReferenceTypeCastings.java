package day36_polimorphismContinue;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day29_inheritance.animalTask.Tiger;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;
import day33_abstraction.employeeTask.*;
import day35_polimorphism.transportationTask.AutoPilot;
import day35_polimorphism.transportationTask.Electric;
import day35_polimorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog= new Dog();

       // Cat cat = new Dog(); // compile error

        Animal animal = (Animal) new Dog(); // child (Dog) implicitly casting to parent (Animal)

        System.out.println("----------------------------------------------");

        Animal animal1 = new Dog(); // upcasting ==> polymorphism
        animal1.setInfo("max", "husky", 'm', 3, "large", "white");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
      //  animal1.bark();   // compile error

     //  cat can not be casted to dog object , there must be a relationship //  ((Cat)animal1).scratch();// explicit casting --> down casting
        ((Dog)animal1).bark();
      //  ((Tiger)animal1).hunt();    // tiger can not be casted to dog
      //  ((Tiger)animal1).sleep(); // tiger can n ot be casted to dog object



        ( (Dog)animal1 ).bark();  // explicit casting -> down casting

        Dog dog1 = (Dog) animal1; // explicit casting --> down casting
        dog1.bark();

        System.out.println("--------------------------------------------------");


        Phone phone = new Nokia("XR30", "small", "Blue", 700);
        phone.call(911);
        phone.text(12345);
       //  phone.sefDefence(); // error
        ((Nokia)phone).selfDefence();


        System.out.println("--------------------------------------------------");


        Employee employee = new Developer("Jora", 23, 'M', "B12", "Java Developer", 98000, "Java");
        System.out.println(employee);
        employee.work();

        System.out.println(((Developer)employee).getProgrammingLanguage());

      //  Tester tester = (Tester) employee;  // compile error

        System.out.println("--------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Tesla Y", "Black", 2020, 65000);
        System.out.println(electric);

        electric.charge();
        ((Tesla)electric).start();
        ((Tesla)electric).selfDrive();
        (( AutoPilot ) electric ).selfDrive();


        System.out.println("--------------------------------------------------");

        Teacher employee1 = new Teacher("James", 34, 'M', "A12", "Math teacher", 85000);
        employee1.work();
        System.out.println(employee1);


        Developer employee2 = new Developer("Jora", 23, 'M', "B12", "Java Developer", 98000, "Java");
        employee2.work();
        System.out.println(employee2);

        Driver employee3 = new Driver("Florea", 44, 'M', "n34", "Uber", 60000);
        employee3.work();
        System.out.println(employee3);

        Tester employee4 = new Tester("Alina", 25, 'F', "M22", "SDET", 85000);
        employee4.work();
        System.out.println(employee4);


    }
}
