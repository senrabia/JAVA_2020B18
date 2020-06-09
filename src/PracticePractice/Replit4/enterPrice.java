package PracticePractice.Replit4;

import java.util.Scanner;

public class enterPrice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int dollar=scan.nextInt();
           dollar=100;
        int penny=dollar/1;
        int nickel=dollar/5;
        int dime=dollar/10;
        int quarter=dollar/25;
        int halfDolar=dollar/50;
        System.out.println(quarter+" quarters "+dime+" dimes "+nickel+"nickels");




                }

            }






