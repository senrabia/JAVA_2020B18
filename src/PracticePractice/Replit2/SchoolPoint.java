package PracticePractice.Replit2;

import java.util.Scanner;

public class SchoolPoint {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1=scan.nextLine();
        double grade1=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2=scan.nextLine();
        double grade2=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3=scan.nextLine();
        double grade3=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4=scan.nextLine();
        double grade4=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5=scan.nextLine();
        double grade5=scan.nextDouble();
        scan.nextLine();
        String  summary= subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5;
        System.out.println("Summary: "+summary);
        double gradex=(grade1+grade2+grade3+grade4+grade5);
        double grade=gradex/5;
        System.out.println("Your average score is: "+grade);
        System.out.println("Thank you for using Grader!\nGoodbye!");


    }
}
