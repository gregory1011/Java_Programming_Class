package day06_ifStatements;

public class if_and_else_StatementIntro {
    public static void main(String[] args) {

        int age = 28;
        if( age >21){
            System.out.println("Eligible");   // true
        }
        if (age<21){
            System.out.println("Not Eligible");   // false
        }
        System.out.println("------------------------------");

        if (age>=21){
            System.out.println("Eligible");    // true
        } else{  // otherwise
            System.out.println("Not Eligible");   // false
        }


    }
}
