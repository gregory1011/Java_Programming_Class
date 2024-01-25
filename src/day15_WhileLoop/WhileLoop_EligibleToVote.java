package day15_WhileLoop;

import java.util.Scanner;

public class WhileLoop_EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = input.nextInt();  // valid age should be 1 to 120

        while ( ! ( age >=1 && age <=120) ){  // while the age is not valid " ! "
            System.err.println("Invalid entry, Please re-enter you age: ");
           age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String yesORNo = input.next().toLowerCase();

        while ( !  ( yesORNo.equals("yes") || yesORNo.equals("no")  )  ){
      // while the answer is neither yes nor no

            System.err.println("Invalid entry! Please re-enter");
            System.out.println("Are you a US citizen? Yes/No");

            yesORNo =  input.next().toLowerCase();

        }


        if (age >= 21 && yesORNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
input.close();






    }
}
