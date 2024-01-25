package day16_NestedLoop;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double number1 = input.nextDouble();
        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);

        while ( ! (operator == '-' || operator == '+'
                || operator == '/' || operator == '*')){
            System.out.println("You entered invalid operator, please re-enter again");
            operator = input.next().charAt(0);
        }

        System.out.println("Enter second number");
        double number2 = input.nextDouble();

        if (operator == '-' ){
            System.out.println("Calculation result = "+(number1 - number2));
        }else if(operator == '+' ){
            System.out.println("Calculation result = "+(number1 + number2));
        }else if(operator == '/'){
            System.out.println("Calculation result = " + (number1 / number2));
        }else{
            System.out.println("Calculation result = "+ (number1 * number2));
        }

        System.out.println("Would you like to continue? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while ( ! (yesOrNo.equals("yes") || yesOrNo.equals("no") ) ) {
            System.out.println("Would you like to continue? Yes/No\"");
            yesOrNo = input.next().toLowerCase();
        }

    }
}
