package day12_CostumMethods;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in );
        System.out.println("Enter your first name");
       String firstName = input.nextLine().trim().replace(" ", "");

        System.out.println("Enter your last name");
       String lastName = input.nextLine().trim().replace(" ", "");

       input.close();

       firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
         // we got "c" lower case converted into uppercase concatenate with the last name of the word in lower case

        lastName = lastName.substring(0, 1).toUpperCase() +lastName.substring(1).toLowerCase();


       String  fullName = firstName + " "+ lastName;


        System.out.println("fullName = " + fullName);



    }
}
