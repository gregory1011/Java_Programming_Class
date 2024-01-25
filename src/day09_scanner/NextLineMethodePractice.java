package day09_scanner;

import java.util.Scanner;

public class NextLineMethodePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre your full name: ");
        String fullNAme = input.nextLine();

        System.out.println("Entre your school name: ");
        String schoolNAme = input.nextLine();

        System.out.println("Entre your gender name: ");
        String gender = input.next();


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter the street name: ");
        String street = input.nextLine();

        System.out.println("Entre your gender name: ");
        System.out.println("schoolNAme = " + schoolNAme);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("street = " + street);
        

        input.close();

    }
}
