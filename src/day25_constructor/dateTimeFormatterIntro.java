package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/y" );

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2023, 8, 10);
        System.out.println(date1.format(df));

        System.out.println("---------------------------");


        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("h:mm a");

        LocalTime time1 = LocalTime.of(17,5);
        System.out.println(time1.format(tf));

        System.out.println("---------------------------");


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd/MMM/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


        System.out.println("---------------------------");


        DateTimeFormatter time2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        LocalDateTime mine = LocalDateTime.of(2020,11, 24,13,00);

        System.out.println(mine.format(time2));




    }

}
