package day15_WhileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int min = 2147483647; // any integer num that user enters will ALWAYS be less than -> ( 2147483648 from google)

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number:"); // 20, 30, -5, 100, 200
            int num = input.nextInt();


            if(num < min){
                min = num;
            }
        }

        System.out.println("minimum number = " + min);
        input.close();
    }
}
