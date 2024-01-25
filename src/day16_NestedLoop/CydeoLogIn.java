package day16_NestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = input.next();
        System.out.println("Enter your password");
        String pass = input.next();

        if (  user.equals("Cydeo") && pass.equals("WoodenSpoon") ){
            System.out.println("Logged in.");
        }else{

            for (int i = 0; i < 3; i++) {

                /*
                if (i !=2){
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last attempt, Please re-enter your username and password");
                }
                 */

                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                user = input.next();
                System.out.println("Enter your password");
                pass = input.next();

                if ( user.equals("Cydeo") && pass.equals("WoodenSpoon") ){
                    System.out.println("Logged in.");
                    break;   // exits the loop

                }
            }
            // after 3 more attempts , if user and password is still incorect
            if (!(user.equals("Cydeo") && pass.equals("Cydeo123"))) {
                System.err.println("Your account is locked.");
            }


        }

        input.close();
    }




    public static void cydeoLogIn( String username, String password){
        if (  username.equals("Cydeo") && password.equals("WoodenSpoon") ){
            System.out.println("Logged in.");
        }else{
            System.out.println("Invalid username credentials");


        }
    }

}
