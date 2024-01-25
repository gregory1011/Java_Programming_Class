package day42_mapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")){
            int frequency = Collections.frequency( Arrays.asList( str.split("")), each );
            if ( frequency == 1) {
                map.put(each.charAt(0), frequency);
            }
        }

        System.out.println(map);





    }
}
