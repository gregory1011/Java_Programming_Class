package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment/decrement
        // "++" increment by 1
        // "--" decrement by 1
        int x = 10;
        System.out.println(++x);   // 11
        System.out.println(x);   // 11
        System.out.println("------");

        int y = 100;
        System.out.println(--y);   // 99
        System.out.println(y);     // 99
        System.out.println("------------");

         // post increment/decrement
        // post decrement "++"
        // post decrement "--"

        int a = 55;
        System.out.println(a++);  // 55 value stay the same, but it wll change next
        System.out.println(a);   // 56 value added 1
        System.out.println("---------------");

        int b = 24;
        System.out.println(b--);   // 24 value stay the same
        System.out.println(b);    // 23 value decrease by 1
        System.out.println("---------------");

        int n = 30;
        int p = n++;   // p=30, n = 31
        System.out.println("p = " + p);   // 30
        System.out.println("n = " + n);  // 31
        System.out.println("---------------");

        int z = 60;
        int q = z--;  // q == 60, z= 59;
        System.out.println("q = " + q);
        System.out.println("z = " + z);



    }
}
