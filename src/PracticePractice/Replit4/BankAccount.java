package PracticePractice.Replit4;
//Harika ile calisma
public class BankAccount {
    //crete custom class
    //account number, balance, account holder

    String accountHolder;
    long accountNumber;
    double balance;


    public BankAccount(){
    }

  public BankAccount(String iaccountHolder,long iaccountNumber,double ibalance){
    this.accountHolder=iaccountHolder; //we used for the easly
    this.accountNumber=iaccountNumber;
    this.balance=ibalance;
    }

   public void checkBalance(){
       System.out.println(balance);

    }

}
