package day37_exception;


import day35_polimorphism.transportationTask.Car;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started");
        Car car = null;

        try {
            car.drive();
        }catch (NullPointerException e){
            System.out.println("1. Catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("2. Catch block");
            e.printStackTrace();
        }

        System.out.println("Program ended.");






    }
}
