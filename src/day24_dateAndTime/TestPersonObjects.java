package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people ={ new Person(),new Person(),new Person(),
                new Person(),new Person() };

        people [0].setInfo("Daniel", 'M', LocalDate.of(1990, 2, 25));
        people [1].setInfo("Becali", 'M', LocalDate.of(1980, 10, 27));
        people [2].setInfo("Messi", 'M', LocalDate.of(1970, 4, 12));
        people [3].setInfo("Duda", 'M', LocalDate.of(2005, 12, 3));
        people [4].setInfo("Haoland", 'M', LocalDate.of(1998, 5, 14));

        ArrayList<Person> soccerList = new ArrayList<>();
        soccerList.addAll(Arrays.asList(people));

        // print name and date of birth of each object

        for (Person each : people) {
            System.out.println(each.name + " : " + each.dateOfBirth);
        }

        // remove persons who are older than >= 35 years old




        for (Person each : people) {
            }
        }



}
