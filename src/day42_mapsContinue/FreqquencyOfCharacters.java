package day42_mapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqquencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (  String each : str.split("") ){
            int frequency = Collections.frequency(Arrays.asList( str.split("") ) , each );

            map.put( each, frequency);
        }

        System.out.println(map);




    }
}
