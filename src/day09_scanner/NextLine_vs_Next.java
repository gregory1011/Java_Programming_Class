package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");
       int age = input.nextInt();

       input.nextLine();
        System.out.println("Enter your full name: ");
       String fullNAme = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullNAme = " + fullNAme);

        input.close();
    }
}
