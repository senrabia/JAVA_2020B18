package PracticePractice.Replit2;


import java.util.Scanner;

public class MetabolikEquvalent {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*One way to measure the amount of energy that is expended during exercise is
        to use metabolic equivalents (MET).
           Here are some METS for various activities:
        - Running 6 MPH: 10 METS
                - Basketball: 8 METS
                - Sleeping: 1 MET
        METS are given per minute.
               The number of calories burned per minute may be estimated using the following formula:
        cal = 0.0175 * METS * Weight in kilograms

        Write a program that asks user to enter his weight in pounds, and then calculates and outputs
        the total number of calories burned for a  person who runs 6 MPH for 30 minutes,
         plays basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
         */
        //Running 6 mpq==>10
         //Basketball==>8

      /*  System.out.println("Enter your weight in lbs.");
        int run=30,
            basket=30,
            sleep=360;
        double MET=19*run+basket+sleep;
       // System.out.println("total"+MET);

        double kg=input.nextDouble();
        double lbs=2.2;
    */

      System.out.println("Enter weight in pounds:");
        double kg=scan.nextDouble();         //scan.nextDouble();
        double lbs=2.2;
        //System.out.println("Enter your weight in lbs.")
        double pounds=kg/lbs;
        int run=30*10;
        int  basket=30*8;
        int sleep=360*1;
        double MET=run+basket+sleep;
        double  calori=0.0175;
        double cal=pounds*(MET*calori);
        System.out.println("Calories Burned: "+cal);




    }

    }

