package PracticePractice.Replit4;

import java.util.Scanner;

public class moneypractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                 If itemPrice is less than 25 or more than 100 cents, then display error message ==> Invalid price!
                If itemPrice is not divisible by 5, then also display error messag ==>Invalid price!
                   use (itemPrice % 5 == 0) expression to find it is divisible by 5.
                  Do not display anything else.*/
        System.out.println("Your change is ");
        int itemPrice = scan.nextInt();
        int quarters = 0;      //scan.nextInt();
        int dimes = 0;         //scan.nextInt();
        int nickels = 1;        //scan.nextInt();
        // if (itemPrice>25 && itemPrice<100){
        //System.out.println("quarters, "+quarters+"dimes, "+dimes+"nickels.");}

        if (itemPrice < 25 && itemPrice > 100) {
            System.out.println("Invalid price!");
        }
        if (itemPrice % 5 != 0) {
            System.out.println("Invalid Price !");
        }
        if (itemPrice % 5 == 0) {
            System.out.println("Invalid Price !");
        }
        if (itemPrice >= 25 && itemPrice <= 100) {
            System.out.println("quarters, " + quarters + " dimes, " + dimes + " nickels.");
        }
    }

}





