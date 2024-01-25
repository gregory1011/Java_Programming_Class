package day37_exception;

public class TryCatchBlock2 {
    public static void main(String[] args) {

        System.out.println("Program 1 started.");

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[100]);
        }catch (RuntimeException e){
          //  e.printStackTrace();  // display full details of the exception after the execution of program
        }

        System.out.println("Program 1 ended.");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Program 2 started.");

        try{
            System.out.println( 9 / 0 );
        }catch (RuntimeException e){
          //  e.printStackTrace();
            System.out.println(e.getMessage());

        }

        System.out.println("Program 2 ended.");









    }
}
