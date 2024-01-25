package day16_NestedLoop;


import java.util.Scanner;

public class LogIn_DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "",
                pass ="";
        int attempt = 3;

        do{
            System.out.println("Enter your username");
            user = input.next();
            System.out.println("Enter your password");
            pass = input.next();

            attempt--;  // attempt - 1 everytime the statement gets executed until teh while condition becomes true

            if (attempt == 0){   // whe the attempts equals 0 exit the loop / the program will stop running
                break;
            }

        }while( ! ( user.equals("Cydeo") && pass.equals("WoodenSpoon")));



    }
}
