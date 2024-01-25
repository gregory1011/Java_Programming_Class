package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 1;
        String result = "Invalid Flor";

        if (floorNumber >= 1 && floorNumber <= 3){
            // there is only 3 floors in the elevator
            result ="Floor "+floorNumber+" is selected. ";

            if ( floorNumber == 1 ){
                result += "Companies: Lobby, Verizon";

            }else if ( floorNumber == 2 ) {
                result+= "Companies: Cydeo, Nasa";

            }else{
                result+= " Companies:Lyft, BofA";
            }

        }

        System.out.println(result);

    }
}
