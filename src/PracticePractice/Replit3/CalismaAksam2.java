package PracticePractice.Replit3;

import java.util.Scanner;

public class CalismaAksam2 {
    public static void main(String[] args) {
        /*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.*/

       /* //ENTER CODE HERE
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter price in cents:");
                int dollar=scan.nextInt();
                int penny=dollar%5;
                int nickel=dollar%100/50;
                int dime=dollar%10/10;
                int quarter=dollar%25/25;
                int halfDolar=dollar%50;
                System.out.println("Your change is "+quarter);
                System.out.print(" quarters, "+dime+" dimes, and "+nickel+" nickels.");*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt(); //45 cent
        int quarters, dimes, nickels, change;
        change = 100 - itemPrice;      // 100-45=55<==bunu nasil hesaplarim
        quarters = change / 25;       //55/25=2    %5
        dimes = (change % 25) / 10;   //int=0;
        nickels = ((change % 25) % 10) / 5; // 5 /5 ==>1
        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) { // itemPrice %5 == 1 same
            System.out.println("Invalid price!");
        } else {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and "
                    + nickels + " nickels.");


        }
    }
}
 /*  Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int dollar=scan.nextInt();
        int penny=dollar%5;
        int nickel=dollar%100/50;
        int dime=dollar%10/10;
        int quarter=dollar%25/25;
        int halfDolar=dollar%50;
        System.out.println("Your change is "+quarter);
        System.out.print(" quarters, "+dime+" dimes, and "+nickel+" nickels.");My Kod*/
