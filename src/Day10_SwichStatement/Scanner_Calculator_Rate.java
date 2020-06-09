package Day10_SwichStatement;

import java.util.Scanner;

public class Scanner_Calculator_Rate {
    /*Write program that ask s luser to enter num1 and num2,
    adn then prints the sum write a program for the rate calculator:rate Calculator
    1.asks the user to enter salary (as intiger)
    2.asks the user how many hours does she /he works in a week
    3.print the hourly rate of the employee
    assume that one year has 52 week.
     */
    //FORMULA==> hourlyRate=(salary/ numberOfWeeks)/weeklyHours
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary=scan.nextInt();

        System.out.println("How manth hours do you work per week");
        byte weeklyHour=scan.nextByte();

        System.out.println("How many weeks do you work in a year");
        byte numberofWeeks=scan.nextByte();

        int hourlyRate=(salary/numberofWeeks)/weeklyHour;
        System.out.println("Your hourly rate is:$"+hourlyRate);

        //hourlyRate=salary

    }
}
