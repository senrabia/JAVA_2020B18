package PracticePractice.Replit4;

import java.util.Scanner;

public class totalSeconds {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter seconds:");
        int totalSeconds=scan.nextInt();

        int hours=totalSeconds/3600;
        int minutes=(totalSeconds%3600)/60;
        int seconds=(totalSeconds%3600)%60;
        System.out.println(hours+" hours"+", "+minutes+" minutes"+", and "+seconds+" seconds");


    }
}
