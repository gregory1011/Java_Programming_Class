package day13_CustomMethods;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if (month <1 || month >12 ){   /// condition : if the month is invalid
            System.err.println("Invalid month number: "+month);
            return;  // if this condition is true ( invalid number) terminate the program, if not read below.
        }

        switch (month){ //  1 ~ 12

            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
            default:
                System.out.println("31 days");

        }

    }
}
