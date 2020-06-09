package PracticePractice.Replit4;

import java.util.Scanner;

public class SeniorCitizen2 {//Bu Dogru olani
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = count.nextInt();
        int nonSeniorCitizens = count.nextInt();
        System.out.println("What is new citizen's age?");
        int age = count.nextInt();
        if (age >= 65) {
            System.out.println("Senior Citizen");
            ++seniorCitizens;
            System.out.println("New seniorCitizens count " + seniorCitizens);
            System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
        } else {
            System.out.println("Non-Senior Citizen");
            ++nonSeniorCitizens;
            System.out.println("New seniorCitizens count " + seniorCitizens);
            System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);}

    }

}

