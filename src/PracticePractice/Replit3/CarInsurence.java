package PracticePractice.Replit3;

import java.util.Scanner;

public class CarInsurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double premium = 0;
        int accidentAmount = 0;
        int daysDTWS = 0;
        int mileWOS = 0;
        int zipCode = 0;
        String referenceNumber = "";


        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String dLis = scan.nextLine();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }
        System.out.println("Is this whicle Owned, Financed, or Leased?");
        String vhicleOwnerShip = scan.next();
        System.out.println("How is this vehicle primarily used?");
        premium += (vhicleOwnerShip.equalsIgnoreCase("ovned")) ?
                10 : 20;
        System.out.println("How is the vehicle primary used");
        String vhicleUsage = scan.next();
        if (vhicleUsage.equalsIgnoreCase("businnes")) {
            premium += 50;
        } else if (vhicleUsage.equalsIgnoreCase("pleasure")) {
            premium += 10;
        } else if (vhicleUsage.equalsIgnoreCase("commute")) {
            premium += 20;
        }
        System.out.println("Days Driven To Work/ Or School");
        daysDTWS = scan.nextInt();
        premium += mileWOS * 1;
        System.out.println("How old are you");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("invalid entry");
            System.exit(0);
        } else if (age >= 16 && age < 18) {
            premium *= 20;
        } else if (age >= 18 && age < 21) {
            premium *= 6;
        } else if (age >= 21 && age > 25) {
            premium *= 2;
        }
        System.out.println("Enter your experiance years");
        int yearsexperiance = scan.nextInt();
        if (!(yearsexperiance > 0 && age - yearsexperiance >= 16)) {
            System.out.println("Invalid Data");
            System.exit(0);
        } else {
            premium -= yearsexperiance * 5;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("yes")) {
            System.out.println("How many");
            accidentAmount = scan.nextInt();
            premium += (accidentAmount * 0.2) * premium;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String continuousInsurance = scan.nextLine();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }
        scan.nextLine();
        System.out.println("What is the higest level of education you have complated?");
        String aducation = scan.nextLine();
        if (aducation.equalsIgnoreCase("PhD") || aducation.equalsIgnoreCase
                ("Barchelors") || aducation.equalsIgnoreCase("Masters")) ;
        {
            premium -= (premium * 0.05);
        }
        if (aducation.equalsIgnoreCase("Doctor")) {
            premium -= (premium * 0.1);
        }
        if (aducation.equalsIgnoreCase("Less then High School")) {
            premium += (premium * 0.05);
        }
        System.out.println(name + "here's ypur quote!");
        System.out.println("Start your policy Today For:$" + premium);
        referenceNumber = referenceNumber.toUpperCase() + name.substring(0, 2) + age + name.substring
                (name.length() - 2, name.length()).toUpperCase() + zipCode + aducation.replace(",", ",");
        System.out.println("Reference number: " + referenceNumber);

    }
}







