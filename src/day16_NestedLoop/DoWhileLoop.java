package day16_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for ( ; condition ; ) {
            System.out.println("for loop will never get executed if the condition is false");
        }

        System.out.println("---------------");

        while(condition){
            System.out.println("While loop will never get executed if the condition is false");
        }


        System.out.println("---------------");

        do{
            System.out.println("Do while Loop: this statement will get only one time executed," +
                    "because the condition is false after this statement");
        }while(condition);


    }
}
