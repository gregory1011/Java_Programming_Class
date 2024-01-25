package day10_String;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your first name");
        String fullName = input.nextLine();

        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your gender");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println("Enter job title");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary");
        long salary = input.nextLong();

        input.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("companyName = " + companyName);
        System.out.println("salary = " + salary);


    }
}
