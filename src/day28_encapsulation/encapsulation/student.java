package day28_encapsulation.encapsulation;

public class student {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if ( age < 5 || age > 100){
            System.err.println("Invalid age: "+ age);
           // return; // exit the method
            System.exit(1); // program gets terminated
        }
        this.age = age;
    }


    public String getName() {
        return name;
    }

     public void setName (String name){
        
        boolean hasDigit = false;

         for (char each : name.toCharArray()) {
             if(Character.isDigit(each))
                 hasDigit = true;
             break;
         }
         if (hasDigit){
             System.err.println("Invalid name : "+ name);
             System.exit(1);
         }

        this.name = name;
     }




}
