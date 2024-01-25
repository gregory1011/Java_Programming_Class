package day05_operators;

public class logicalOperators {
    public static void main(String[] args) {
        // Logical and operator &&
        double salary = 60000;
        int creditScore = 650,
                age = 35;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
          //                             true    &&           true      &&       true

        System.out.println(eligibleForLoan);    // true
        System.out.println("------------------------------------------");
        age =18;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country=="USA" ;
                       //        true      &&          true
        System.out.println(eligibleToVote); // true
        age =34;
        country = "japan";
        boolean eligibleToGo = age >= 18 && country=="USA";
                       //        true  &&           false
        System.out.println(eligibleToGo);   // false

        System.out.println("------------------------");

        // logical OR operator ||

        String answer = "no";
        boolean validAnswer = answer =="yes"|| answer == "no";
         //                            false ||          true
        System.out.println(validAnswer);    // true

        System.out.println("------------------------");

        char grade = 'B';
        boolean passTheExam = grade =='A' || grade == 'B' || grade == 'C'||grade == 'D';
        System.out.println(passTheExam); // true

        System.out.println("------------------------");
        System.out.println(!true);     // false
        String a = "yes";
        boolean yes = a == "yes";   // true
        boolean no = !yes;          // false
        System.out.println("no = " + no);
        System.out.println("yes = " + yes);
        System.out.println("------------------------");

        int score = 64;
        boolean passed= score >= 60;
        boolean fail= !passed;
        System.out.println("passed = " + passed);  // true
        System.out.println("fail = " + fail);      // false
        System.out.println("------------------------");

        System.out.println( true == !false  && false == !true  && true != !true);
            //                 true         &&        true    &&













    }

}
