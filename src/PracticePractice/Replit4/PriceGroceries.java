package PracticePractice.Replit4;

import java.util.Scanner;

public class PriceGroceries {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Item2 and its price:");
        String item2 = scan.nextLine();
        double price2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.nextLine();
        double price3 = scan.nextDouble();
        String result = "Item1: " + item1 + " Price: " + price1 + "," +
                " Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3;
        System.out.println(result);
        scan.nextLine();
        System.out.println("Total price: "+(price1+(price2+(+price3))));
    }
}
        // System.out.println((price1+(price2+(+price3))));
/*In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Execution flow with example:

-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5

-Display prompt "Enter Item2 and its price:"
Cheese
3.5

-Display prompt "Enter Item3 and its price:"
Apples
6.3

-calculate totalPrice for all items

-build the report variable by concatenating Strings and double values:

"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"

- Print the value of report variable

*/



