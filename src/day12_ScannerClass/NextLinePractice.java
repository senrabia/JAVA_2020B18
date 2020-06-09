package day12_ScannerClass;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();//30+Enter same time

        System.out.println("Your age is" + age);

       input.nextLine();//RUULS==>Very Important it will be WORK==>Name part

        System.out.println("Enter your full name:");
        String fullname = input.nextLine();

        System.out.println("Your full name is:" + fullname);


    }
}
