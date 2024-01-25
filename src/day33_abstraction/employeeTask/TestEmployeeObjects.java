package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("James", 34, 'M', "A12", "Math teacher", 85000);
        System.out.println(teacher);
        teacher.work();

        Developer developer = new Developer("Jora", 23, 'M', "B12", "Java Developer", 98000, "Java");
        System.out.println(developer);
        developer.work();

        Driver driver = new Driver("Florea", 44, 'M', "n34", "Uber", 60000);
        System.out.println(driver);
        driver.work();

        Tester tester = new Tester("Alina", 25, 'F', "M22", "SDET", 85000);
        System.out.println(tester);
        tester.work();


    }
}
