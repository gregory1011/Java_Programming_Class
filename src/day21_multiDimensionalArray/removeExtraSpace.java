package day21_multiDimensionalArray;

import java.util.Arrays;

public class removeExtraSpace {
    public static void main(String[] args) {

        String str = "    Hello world       I      love      Java    ";
        str = str.trim();
        System.out.println(str);
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        str ="";

        for( String each : words ){
            if (! each.isEmpty() )
                str += each + " ";
        }
        str = str.trim();
        System.out.println(str);


    }
}
