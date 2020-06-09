package Day33_CustomMethod_Intro;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Anna=new BankAccount();
       Anna.accountHolder="Anna";
       Anna.accountNumber=123456;
 //==========  Checkking Balance ================
 Anna.checkingBalance();
 Anna.deposit(33);

 Anna.checkingBalance();
 Anna.withDraw(13);

 Anna.checkingBalance();
 Anna.withDraw(30); // Balance is -10 this is a bug

        Anna.checkingBalance();
        Anna.withDraw(1000); // this is bug - 1010
        Anna.checkingBalance();
        System.out.println("=======================");
        System.out.println(Anna);


    }

}
