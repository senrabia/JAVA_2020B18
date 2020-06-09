package Day41_Inheritance.Task2;

public class AccountObjects {
    public static void main(String[] args) {
        CheckingAccount obj=new CheckingAccount();
        obj.accountHolder="Rabia Sen";

        obj.showBalance(); //Available balance: 0.0
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withDraw(1000);
        obj.showBalance();

        System.out.println(obj);
        System.out.println("=========================");

        SavingAccount saving=new SavingAccount();
        saving.accountHolder="Elif";
        saving.deposit(200);
        System.out.println(saving);

        System.out.println(saving.interestRate);
        System.out.println(saving);

        saving.deposit(3000);
        saving.showBalance();

        //saving.withDraw


    }
}
