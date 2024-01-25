package day09_scanner;

import java.util.Scanner;

public class Scanner_Intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your 3rd number: ");

        int num3 = input.nextInt();

        System.out.println("4th number: ");
        long num4 = input.nextLong();

        input.close();  // scanner is closed, cannot read user inputs again


        System.out.println("First number: "+num);
        System.out.println("Second number: "+num2);
        System.out.println("3rd number: "+ num3);
        System.out.println("4th number: "+num4);

    }
}
