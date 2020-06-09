package day12_ScannerClass;

import java.util.Scanner;

public class NextLine_ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the full name:");
        String fullName=input.nextLine();//accepts the "Enters

        System.out.println("Your fuul name is"+fullName);
        System.out.println("Enter your sentense:");
        String sentence=input.nextLine();

        System.out.println("You entered: "+sentence);



    }








}
