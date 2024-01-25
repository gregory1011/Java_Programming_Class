package day38_exceptionsContinue;


   class CustomCheckedException extends Exception{

}
   class CustomUncheckedException extends RuntimeException{

   }


public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            throw new RuntimeException(e);
        }


    }
}
