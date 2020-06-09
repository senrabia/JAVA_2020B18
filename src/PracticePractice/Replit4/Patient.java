package PracticePractice.Replit4;

import java.util.Scanner;

public class Patient {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Enter your code here
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();
        String fullName=scan.nextLine();
        System.out.println("Enter your email");
        String email=scan.nextLine();
        System.out.println("Enter your street");
        String street=scan.nextLine();
        System.out.println("Enter your city");
        String city=scan.nextLine();
        System.out.println("Enter your state");
        String state=scan.nextLine();
        System.out.println("Enter your zip code");
        int zipCode=scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone=scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personelNumber=scan.nextLong();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarriage=scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: "+lastName+", "+firstName);
        // System.out.println(street+""+city+"")
        System.out.println("Address: "+street+", "+city+", "+state+" "+zipCode);
        System.out.println("Contacts: work phone number - "+workPhone+", personal phone number - "+personelNumber+", email: "+email);
        //System.out.println(email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarriage);



    }
}
