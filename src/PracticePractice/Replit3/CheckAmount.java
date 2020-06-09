package PracticePractice.Replit3;

import java.util.Scanner;

public class CheckAmount {
    public static void main(String[] args) {
         /*
 Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
  */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Split or No split");
        String Split= input.next();
        System.out.println("Enter Number of people entered");
        int NumberOfPeople=input.nextInt();
        input.nextLine();
        System.out.println("Enter Service Quality");
        String ServiceQuality= input.nextLine();
        System.out.println("Enter Check Amount");
        double CheckAmount=input.nextDouble();
        double TotalToPay=0;
        double TotalTip=0;
        double TipPerPerson=0;
        boolean TipperPerson1= TipPerPerson==0;
        boolean Poor=ServiceQuality.equalsIgnoreCase("poor");
        boolean Fair= ServiceQuality.equalsIgnoreCase("fair");
        boolean Good= ServiceQuality.equalsIgnoreCase("good");
        boolean Great = ServiceQuality.equalsIgnoreCase("great");
        boolean Excellent=ServiceQuality.equalsIgnoreCase("excellent");
        if(Poor) {
            TotalTip= CheckAmount/100%5;
        } else if(Fair) {
            TotalTip= CheckAmount/100%10;
        } else if (Good) {
            TotalTip= CheckAmount/100%15;
        } else if (Great) {
            TotalTip= CheckAmount/100%20;
        } else {
            TotalTip= CheckAmount/100%25;
        }
        boolean YesSplit= Split.equalsIgnoreCase("yes");
        boolean NoSplit= Split.equalsIgnoreCase("no");
        if(YesSplit) {
            TotalToPay= CheckAmount/NumberOfPeople;
            TipPerPerson=  TotalTip/NumberOfPeople;
        } else {
            TotalToPay=CheckAmount;
            System.out.println(TipperPerson1);
        }
        System.out.println("Number of people entered:" + NumberOfPeople);
        System.out.println("Total to pay: " + TotalToPay);
        System.out.println("Total tip: " + TotalTip);
        System.out.println("Tip per person: " + TipPerPerson);
    }

}
