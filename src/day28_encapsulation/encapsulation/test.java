package day28_encapsulation.encapsulation;

public class test {
    public static void main(String[] args) {

        student group1 = new student();
       // group1.age = -200;
       // System.out.println("age: "+ group1.age);

        group1.setAge(25);
        System.out.println( "Student age : " +group1.getAge());


        group1.setName("01. Jora");
        System.out.println("Student name is: "+group1.getName());


        System.out.println("Test completed");


    }
}
