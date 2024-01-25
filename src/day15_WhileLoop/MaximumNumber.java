package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int max = -2147483648;  // any integer num that user enters will ALWAYS be greater (-2147483648 from google)

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();  // 10, 20, 33, 44, 45
            
            if ( num > max){ // if the user entered entry is greater than the current maximum number that we have,
                max = num;   // then the user entered number should be the maxim number.
            }
        }

        System.out.println("max number = " + max);

    }
}
/*
Warmup tasks:
	1. Write a program that can ask the user to enter a number for 5 times
	and returns the maximum number
	2. Write a program that can ask the user to enter a number for 5 times
	 and returns the minimum number
   3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc



 */