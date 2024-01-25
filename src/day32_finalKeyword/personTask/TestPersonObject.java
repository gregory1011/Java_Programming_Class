package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M',  LocalDate.of(1990, 3, 23));
        System.out.println(person);
        person.breath();
        System.out.println("-------------------------------------------------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1993, 4, 29), "Accountant", 80000);
        System.out.println(employee);
        employee.breath();

        Student student = new Student("Jora", 'M', LocalDate.of(1994, 5, 19), 'A', "Cydeo");
        System.out.println(student);
        student.breath();
        student.study();
        student.eat();
        student.drink();
        student.sleep();

    }
}
