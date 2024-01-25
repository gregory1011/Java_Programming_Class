package day30_inheritance.typesOfInhiretance;

import javax.swing.*;
import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5,16), 'A', "A11333");

        President president = new President("Trump", 'M', LocalDate.of(1980, 4, 23), LocalDate.now());

        Teacher teacher = new Teacher("Jora", 'M', LocalDate.of(1995, 4 ,29), "Java developer","A3223", 120000  );


        System.out.println(teacher);
        System.out.println(student);
        System.out.println(president);


        student.study();
        president.lie();
        teacher.teach();

        System.out.println("---------------------------------------");

        student.eat("Susi");
        teacher.eat("Ice cream");
        president.eat("stake");

        student.drink("water");
        teacher.drink("cola");
        president.drink("wiski");


    }
}
