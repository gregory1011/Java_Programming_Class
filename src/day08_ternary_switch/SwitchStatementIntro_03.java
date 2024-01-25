package day08_ternary_switch;

public class SwitchStatementIntro_03 {

    public static void main(String[] args) {

        int score = 85; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }

        /*
        switch (score){
            case >= 80 && <= 90
        }
*/
        //-----------------------------------------------------------

        int number = 7;

        String month = "";

        switch (number ){
            case 1:
                result = "January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result= "March";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result ="August";
                break;
            case 9:
                result="September";
                break;
            case 10:
                result="October";
                break;
            case 11:
                result="November";
                break;
            case 12:
                result="December";
                break;
            default:
                result="Invalid month";

        }


        System.out.println(result);

    }
}
