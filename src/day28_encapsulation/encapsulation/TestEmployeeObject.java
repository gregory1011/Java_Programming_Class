package day28_encapsulation.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {

      /*
        Employee worker1 = new Employee();
       // worker1.salary = -10000;

        worker1.setSalary(2100000);
        System.out.println("Worker salary is: "+worker1.getSalary());

      //  worker1.setName("Jora");
        System.out.println("Worker name is: "+ worker1.getName());

       */

        Employee worker1 = new Employee("Jora", 18, "Developer", 200000);

        System.out.println(worker1);


    }
}
