package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1991, 5, 15);
        System.out.println(birthDay);

        System.out.println(today.getYear());  // 2023

        System.out.println( today.getMonth());   // April

        System.out.println(today.getMonthValue());

        System.out.println( today.getDayOfWeek());

        System.out.println(birthDay.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("--------------------------");

        today =  today.plusYears(1);
        System.out.println(today);

        System.out.println("--------------------------");


        LocalDate graduationDate = LocalDate.of(2025,6,4);
        graduationDate = graduationDate.plusYears(2);  // plus 2 years
        System.out.println(graduationDate); // 2027-06-04
        graduationDate = graduationDate.plusMonths(7);   // plus 7 months

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7); // plus 7 weeks
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100); // plus 100 days
        System.out.println(graduationDate);

        System.out.println("-------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        System.out.println(yourBirthDay);

        LocalDate brotherBirthDay = yourBirthDay.minusYears(2). minusMonths(3);
        System.out.println(brotherBirthDay);

        System.out.println("-------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6, 7);

        boolean result = birthday1.isEqual(birthday2);
        System.out.println(result);   // false

        System.out.println("-------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 8,29);

        System.out.println(grad_date.isBefore( LocalDate.of(2023,4,4)));   // false
        System.out.println(grad_date.isAfter( LocalDate.of(2023,4,4)));    // true

        System.out.println("-------------------------------");

        System.out.println(LocalDate.of(2023,4,4).isLeapYear());  // is this leap year that has 356 days -> false //

    }
}
