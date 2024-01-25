package day15_WhileLoop;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first number");
        double num1 = input.nextDouble();
        System.out.println("Enter you second number");
        double num2 = input.nextDouble();
        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);

        while ( ! (operator== '-' || operator== '+' || operator== '*' || operator == '/')){
            System.err.println("Invalid operator. Please re-enter again");
            operator = input.next().charAt(0);
        }


        if(operator == '-'){
            System.out.println(num1-num2);
        }else if(operator == '+'){
            System.out.println(num1+num2);
        }else if (operator == '*'){
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }


    }
}
