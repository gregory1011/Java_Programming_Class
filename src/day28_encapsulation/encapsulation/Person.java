package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null &&  name.isBlank() && name.isEmpty()){
            System.err.println("Unknown name");
            System.exit(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( gender == 'M' && gender == 'F'){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*
variables:
  name, age, gender, dateOfBirth;
  name:
       write: can not be null/empty/blank
  age:
       write: can not be      
 */