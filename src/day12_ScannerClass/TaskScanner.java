package day12_ScannerClass;

import java.util.Scanner;

public class TaskScanner {
    /*Task=
     1.ask teh userr enter first name
     2. ask user to enter last name
     3. ask the user employeed or not?true==>employeed, false==>unemployeed
     4.if he is employeed ask the salary
     5.if he is not employeed set the salary to 0
     output:fullname:
           employeed status:
           saalary:

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName=input.next();

        System.out.println("Enter your last name:");
        String lastName=input.next();
        String fulName=firstName+""+lastName;

        System.out.println("Are you employeed");
        boolean employeementStatus=input.nextBoolean();
        double salary=0;

        if (employeementStatus == true) {
            System.out.println("Enter your salary:");
            salary=input.nextDouble();
        }


        System.out.println("Full name is:"+fulName);
        System.out.println("Employeed:"+employeementStatus);
        System.out.println("Salary: $"+salary);





    }
}
