package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        System.out.println(a>b);  // true
        int c = 100;
        int d = 200;
        System.out.println(c>d);  // false
        System.out.println("--------------------");
        boolean aIsGreater = a>b,   //true
                cIsGreater = c>d;    // false
        System.out.println(aIsGreater);
        System.out.println(cIsGreater);
        System.out.println("--------------------");

        int score = 75;
        boolean passed = score >=60;
        System.out.println(passed);  // true
        System.out.println("--------------------");

        int age = 22;
        boolean eligible = age >= 21;
        System.out.println("eligible = " + eligible);  // true
        boolean eligibleToVote = age >=18;
        System.out.println(eligibleToVote);   // true
        System.out.println("--------------------");
        System.out.println(100>100);  //false
        System.out.println(100>=100);  // true
        System.out.println(100>= 185);   // false
        System.out.println("--------------------");

        score = 48;
        boolean failed = score <60;
        System.out.println(failed);   // true
        System.out.println("--------------------");

        System.out.println(100<2000);   // true
        System.out.println(100 <20);    // false

        System.out.println("--------------------");

        System.out.println(95<= 100);   // true
        System.out.println(100<=100);    // true
        System.out.println(10<= 9);     // false
        System.out.println("--------------------");
      //  System.out.println("Java"<="C#");  // > ,<, >= , <= only applicable for numbers, but not string of test
        System.out.println('a'>'b');  // true
             //            65 > 66    true












    }
}
