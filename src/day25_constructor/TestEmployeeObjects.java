package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alonso", 20, 'M', "SDET", 87000, LocalDate.of(2023,2, 27));
        Employee e2 = new Employee("Xavi", 32, 'M', "Java Developer", 95000, LocalDate.of(2023, 4,4));

        System.out.println(e1);
        System.out.println(e2);


    }
}
