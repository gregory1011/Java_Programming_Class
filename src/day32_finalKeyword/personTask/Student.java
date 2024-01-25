package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person {

    private char grade;
    private String schoolName;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String schoolName) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study (){
        System.out.println(getName() +" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


}
