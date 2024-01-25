package day37_exception;

public class TryCatchBlocks {
    public static void main(String[] args) {

        Pizza pizza = null;

        System.out.println("Program 1 start");
        try{
            System.out.println( pizza.calcCost() );
            System.out.println("Try block");
        }catch (ArithmeticException e ){
            System.out.println("Catch block");
        }catch (NullPointerException e){
            System.out.println("Catch null ");
        }

        System.out.println("Program 1 end");



        System.out.println("-------------------------------------------------------------");

        System.out.println( "Program 2 Start");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
        }
        System.out.println( "Program 2 ended");


        System.out.println("-------------------------------------------------------------");

        System.out.println( "Program 3 Start");

       //  Thread.sleep(3000);

        System.out.println("");


    }
}
