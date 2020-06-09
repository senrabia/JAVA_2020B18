package Day41_Inheritance.Task2;
/*create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
*/
public class SavingAccount extends BankAccount {
    /*accountNumber
    accountHolder
    balance

    interestRate

    deposit(Inherited)
    showBalance(Inherited)
    toString(Inherited)
     */
   public static double interestRate;
   static{  //bu Static degilde instance metod gosterseydik
       interestRate=0.02; // 2.0/100; it can be
        }


}
