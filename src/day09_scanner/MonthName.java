package day09_scanner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println("Enter month number: ");

        String month = (n ==1 )?"January":(n==2)?"February":(n==3)?"March":(n == 4)?"April"
                :(n==5)?"May":(n==6)?"June":(n==7)?"July":(n==8)?"August":(n==9)?"September"
                :(n==10)?"October":(n==11)?"November":"December";
        input.close();
        System.out.println("Month selected is: "+month);
    }
}
