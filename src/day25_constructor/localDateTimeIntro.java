package day25_constructor;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class localDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

       LocalDateTime ends =  LocalDateTime.of(2005, 5,18, 11, 0);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour());


    }
}
