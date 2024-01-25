package day16_NestedLoop;

import java.util.Scanner;

public class OddOREven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an Even number ");
            } else {
                System.out.println(number + " is an Odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while ( !  ( answer.equals("yes") || answer.equals("no")) ){
                // while the user enter invalid entry
                System.err.println("Invalid entry! would you like to enter again?");
                 answer = input.next();
            }

            if (answer.equals("no")) {
                System.out.println("Have a nice day!");
                break;
            }


        }

    }
}
