package PracticePractice.Replit3;

import java.util.Scanner;

public class replitREalestate {
    public static void main(String[] args) {


        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        double marketPrice =scan.nextDouble();
        System.out.println("Enter your property type: ");
        String answer = scan.nextLine();                      //Condo
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();                   //3
        scan.nextLine();
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();                      //true|| false
        scan.nextLine();
        System.out.println("Backyard is not available for condo!");
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();                       //true||false
        scan.nextLine();
        System.out.println("How many spots?");
        int spots = scan.nextInt();                        //2
        scan.nextLine();
        System.out.println("How close is metro station?");
         metroAccessibility = scan.nextFloat();           //0.5
        scan.nextLine();
        System.out.println("How close is highway?");
         highwayAccessibility = scan.nextFloat();         //1.5
        scan.nextLine();
        System.out.println("What's the rating of nearest school?");
        int raiting = scan.nextInt();                      //9
        scan.nextLine();
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Market report has been generated.");  //238000$
        System.out.println("Your estimate market price is:" + marketPrice);
        //==================================================================
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type: ");
        System.out.println("Single Family Home");
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms=scan.nextInt();//10
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();  //true
        System.out.println("How many spots?");
        spots = scan.nextInt();         //11
        System.out.println("Pardon, it's not a public parking!");
        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextInt();//1
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextInt();
        System.out.println("What's the rating of nearest school?");
        schoolScore= scan.nextFloat();              // 1
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();      // false
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+marketPrice);



    }
}