package day06_ifStatements;

public class Is_Statement_Intro {
    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number >0;
        boolean isNegative = number <0;
        boolean isZero = number == 0;

        if ( isPositive) {
            System.out.println(number + " is positive");
        }

        if(isNegative) {
            System.out.println(number + " is negative");   //  true
        }

        if (isZero) {
            System.out.println(number + " is zero");
        }
        System.out.println("-----------------------------------------");

        int num = 100;
        if (num >0) {
            System.out.println(num + " is positive number");   // true
        }
        if (num <0){
            System.out.println(num+ " is negative number ");     // false
        }
        if(num == 0){
            System.out.println(num+" is Zero");    // false
        }


    }
}
