package day07_ifStatments;

public class NestedIf_Intro {
    public static void main(String[] args) {

        int score = -95;

        if (score>= 0 && score<=100){

           if (score >= 60) {
            System.out.println("Passed");
           }else {
            System.out.println("Failed");
           }
        }else{
                System.out.println("Invalid Score");
        }


        System.out.println("--------------------------");


        int age = 32;   // 1 ~ 150 age

        if (age >= 1 && age <=150){

        }else{
            System.out.println("Invalid age");
        }


        if (age >=21) {
            System.out.println("Eligible ");
        }else {
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------");


        int day = 5;

        if (day == 1){
            System.out.println("Monday");
        }


    }

}
