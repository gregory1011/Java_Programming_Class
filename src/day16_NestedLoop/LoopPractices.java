package day16_NestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        // Example for loop
        for (int i = 1; i < 6; i++) {
            System.out.println(i +" This statement will be repeated 5 times");
        }

        System.out.println("----------------------------------------------------");

        // example of while loop
        int i = 0;
        while(i <= 4 ) {
            System.out.println(i +" -This statement will be repeated 5 times");
            i++;
        }

        System.out.println("----------------------------------------------------");

        // Example do while loop
        int j =0;
        do{
            System.out.println(j +" This statement will be repeated 6 times");
            j++;  // this statement is responsible to count the number of cycles,
                  // if the number of cycles starting from 0 to =5 the cycle stops running
        }while( j <= 5);

        System.out.println("----------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade");
        int score = input.nextInt();

        while (score >100 || score <0){  // while the score is invalid
            System.out.println("Invalid Score, please re-enter your score");
            score = input.nextInt();
        }

        if (score >=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



    }
}
