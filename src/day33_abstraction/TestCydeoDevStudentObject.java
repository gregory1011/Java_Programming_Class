package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {
    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M',
                LocalDate.of(1993, 5, 15),
                "A12", "Alumni dev", 29);

        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();

    }
}
