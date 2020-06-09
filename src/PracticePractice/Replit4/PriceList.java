package PracticePractice.Replit4;

import java.util.Scanner;

public class PriceList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* -Declare 4 String variables item1, item2, item3, report.
                -Declare double variables price1, price2, price3, total price
                -Declare int variables count1, count2, count3
                -Create a Scanner object named
                  Execution flow using with example:
                 Use scanner to read all 3 values.
         -Display prompt "Enter Item1, count and i*/
        System.out.println("Enter Item1, count and price: ");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and price: ");
        String item2 = scan.next();
        int count2 = scan.nextInt();                                                               //scan.nextLine();
        double price2 = scan.nextDouble();                                                         //scan.nextLine();
        System.out.println("Enter Item3, count and price: ");
        String item3 = scan.nextLine();
        int count3 = scan.nextInt();
        scan.nextLine();
        double price3 = scan.nextDouble();
        scan.nextLine();
        double totalaPrice = (price1 * count1 + price2 * count2 + price3 * count3);
//=====================================================================
     /*DOGRU OLAN BU YUKARDAKI BITMEDI
       Scanner scan = new Scanner (System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1= scan.next();
        int count1=scan.nextInt();
        double price1=scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2= scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3= scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();
        double totalPrice=price1*count1+price2*count2+price3*count3;
        String report=" ";
        if(count1==0){
            report="Item2: "+item2+" "+"Price: "+price2*count2+","+" Item3: "+item3+" "+"Price: "+price3*count3;
            System.out.println("Total price: "+totalPrice);
        }else if(count2==0){
            report="Item1: "+item1+" "+"Price: "+price1*count1+","+" Item3: "+item3+" "+"Price: "+price3*count3;
        }else if(count3==0){
            report="Item1: "+item1+" "+"Price: "+price1*count1+","+" Item2: "+item2+" "+"Price: "+price2*count2;
        }
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
    }}
    */

    }
}











