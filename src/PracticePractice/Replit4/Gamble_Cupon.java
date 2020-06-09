package PracticePractice.Replit4;

import java.util.Scanner;

public class Gamble_Cupon {
            public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter numbers of cupons: ");
                int numberOfCupons=scan.nextInt();
                int numberOfCandies=scan.nextInt();
                int numberOfGumbles=scan.nextInt();
                scan.nextLine();
                System.out.println("Number of Candies:"+numberOfCandies);
                System.out.println("Number of Gumbles:"+numberOfGumbles);
                System.out.println(numberOfCupons-(numberOfCandies+numberOfGumbles));
                System.out.println("Enter numbers of cupons: ");
                scan.nextLine();
                System.out.println("Number of Candies:"+numberOfCandies);
                System.out.println("Number of Gumbles:"+numberOfGumbles);
                System.out.println(numberOfCupons-(numberOfCandies+numberOfGumbles));
                scan.nextLine();
                System.out.println("Enter numbers of cupons: ");
                System.out.println("Not enough cupons");


                //System.out.println(numberOfCupons);

      /*  Example1:
       Display prompt: "Enter number of coupons:"
        13
        Display prompt: "Number of Candies: 1"
        Display prompt: "Number of Gumballs: 1"
       Example2:
        Display prompt: "Enter number of coupons:"
        23
        Display prompt: "Number of Candies: 2"
        Display prompt: "Number of Gumballs: 1"
         Example3:
       Display prompt: "Enter number of coupons:"
        2
        Display prompt: "Not enough coupons"*/
                // System.out.println("Enter numbers of coupons: ");
                //System.out.println(numberOfCupons);








    }
}
