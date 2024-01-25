package day05_operators;

public class ShortHandOperator {
    public static void main(String[] args) {
        // assignment operator
        int a = 20;
        System.out.println(a);  // 20
        System.out.println(a);   // 20
        a = 40;
        System.out.println(a);   // 40
        a = 25 ;
        System.out.println(a);   // 25
                a = 60;
        System.out.println(a); //60
        System.out.println("-----------");

        // addition assignment operator
        double balance = 100;
        balance += 1000; // balance = 100 + 1000
        System.out.println("balance = " + balance);   // 1100

        balance += 400; // balance 1100 + 400
        System.out.println("balance = " + balance);   // 1500
        balance += 300;   // current balance 1500 + 300
        System.out.println("balance = " + balance);   // 1800
        System.out.println("----------------------");

        // substraction assignment operator
        balance -= 400;    // current balance 1800 - 400
        System.out.println("balance = " + balance);    // 1400
        balance -=200;
        System.out.println("balance = " + balance);   //1200
        System.out.println("---------------------------------------------");

        double salary = 45000;
        salary *=2;   // salary 45000 * 2
        System.out.println(salary);
        System.out.println("salary = " + salary);  /// salary = 90000
        salary *= 3;  //  salary = 90000 * 3
        System.out.println("salary = " + salary);    // new salary = 270,000
        System.out.println("---------------------------------------------");

        double eth = 4;
        eth *= 250;  // eth = 4 * 250
        System.out.println("eth = " + eth); /// new eth = 10000
        eth /= 2;   // eth = 1000 / 2
        System.out.println("eth = " + eth);  // new eth = 500
        System.out.println("---------------------------------------------");

        System.out.println("salary = " + salary);   // old salary = 270,000
        salary /= 2;   // salary = 270000 / 2
        System.out.println("salary = " + salary);   // new salary 135000

        System.out.println("---------------------------------------------");

        // reminder assignment operator

        int b = 39;
        b %= 7;   // b = 39 / 7
        System.out.println(b);   // new b = 4














    }
}
