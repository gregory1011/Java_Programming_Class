package day08_ternary_switch;

public class TernaryIntro_03 {

    public static void main(String[] args) {


        int score = 98;
       /* String result="";

        if (score >= 0 && score <=100){
           if (score >=60){
            result = "Passed";
           }else {
            result="failed";
           }
        }else {
            result ="Invalid";
        }
        System.out.println(result);

        */

        String  result = (score >= 0 && score <=100)?
                          (score >=60)?"Passed" : "Failed"
                     : "Invalid";
        System.out.println(result);


        System.out.println("----------------   -------     ");


        int n = 5;


    }
}
