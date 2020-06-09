package Day41_Inheritance.Task2;
/*create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance*/


public class CheckingAccount extends BankAccount{
    /*accountNumber(Inherited)
      accountHolder(Inherited)
      balance(Inherited)

      deposit(Inherited)
      withDraw ()(declared)
      showBalance(Inherited)
      toString(Inherited)
     */
  //every V time INSTANCE variable INSTANCE declareted
  /*Onemli: Eger Static kullanirsak EROR ==> class BankAccount sayfasindan (public double amount String )
  yapilirsa bu sefer Logical EROR */

    public  void withDraw(int amount){
      balance-=amount;
  }
}
