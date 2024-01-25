package day07_ifStatments;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;   // score is 0 ~ 100
        String result = "Your grade is ";

        if (score >= 90){
            result ="A";
        }else if( score >= 80  ){
            result = "B";
        }else if ( score >= 70 ){
            result = "C";
        } else if (score >=60 ){
            result ="D";
        } else {
            result= "F";
        }
        System.out.println("Your grade is "+result);

    }


}
