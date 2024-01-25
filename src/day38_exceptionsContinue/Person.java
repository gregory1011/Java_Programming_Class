package day38_exceptionsContinue;

public class Person {

    private String name;
    private int age;
    private  final char gender;

    public Person(String name, int age, char gender) {
        setAge(age);
        setName(name);
        if ( ! (gender == 'F' || gender =='M' ) ){
            throw new RuntimeException("Invalid gender: "+ gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if ( age == 0  ){
            throw new RuntimeException("Age cannot be set: " + age);
        }
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 || age >= 150 ){
            throw new RuntimeException("invalid age: "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


}
