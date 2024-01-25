package day09_scanner;

import java.util.Scanner;

public class Alchool {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int age = input.nextInt();
        String result = "";

        if (age >=21 && age< 130){
            result = "Eligible";
        }else {
            result = "not Eligible";
        }
        input.close();
        System.out.println(result);
    }
}
