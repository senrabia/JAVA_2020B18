package Day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount Irina=new BankAccount("Irina", "Li"); //creating the object otherwise  EROR (Irina Li)
       //  System.out.println(Irina.accountHolder); //EROR not working
        System.out.println(Irina.getAccountHolder());

        System.out.println(Irina.getBalance());  //0.0
        Irina.checkBalance(); //Available Balance: 0.0
        Irina.depositing(120); //Available Balance: 120.0
        Irina.checkBalance();
        Irina.withdrawing(80); //40.0
        Irina.checkBalance();
        System.out.println(Irina);//Full Name: Irina Li, Balance: 40.0

        Irina.withdrawing(100);
        System.out.println(Irina);  // BUG =Full Name: Irina Li, Balance: -60.0
        Irina.depositing(200000);
        System.out.println(Irina); //Full Name: Irina Li, Balance: 199940.0

    }
}
