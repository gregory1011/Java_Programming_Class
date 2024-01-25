package day17_CustomClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Hilary", 32, 'F', "School Teacher", 80000, "S2012345") ;


        Employee employee2 = new Employee();
        employee2.setInfo("Angela", 35, 'F', "Realtor", 1500000, "S3456789");

        Employee employee3 = new Employee();
        employee3.setInfo("Greg", 29, 'M', "Driver", 40000, "S55666015");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }
}
