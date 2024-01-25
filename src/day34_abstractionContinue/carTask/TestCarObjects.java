package day34_abstractionContinue.carTask;

import day33_abstraction.employeeTask.Tester;

public class TestCarObjects {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");


        Honda honda = new Honda("Pilot", "Black", 2018, 24000);
        System.out.println(honda);
        honda.start();
        honda.stop();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        Audi audi = new Audi("A6", "White", 2020, 46000);
        System.out.println(audi);
        audi.start();
        audi.stop();
        audi.autoPark();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");


        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 67000);
        System.out.println(tesla);
        tesla.start();
        tesla.stop();
        tesla.autoPilot();




    }
}
