package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Rosca", 123456789);
        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(1200);

        obj1.checkBalance();


        System.out.println("_----------------------------------------_______");


        BankAccount account1 = new BankAccount();
        account1.setInfo("Jhon", 598764321);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Florea", 212345678);

        account1.deposit(5000);
        account2.deposit(4000);

        System.out.println(account2);
        System.out.println(account1);


        account1.withdraw(2000);
        System.out.println(account1);


    }
}
