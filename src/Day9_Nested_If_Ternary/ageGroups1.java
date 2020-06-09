package Day9_Nested_If_Ternary;

public class ageGroups1 {
    public static void main(String[] args) {
/* write a program can define the age of a person age groups are;
        baby (< 3 year)
        Toddler (3 - 5),
                Kid (6 - 9),
                Pre-Teen (10 - 12),
                Teenager (13 - 17),
                Young Adult (18 - 20),
                Adult (21 - 39),
                Young Middle-Aged Adult (40 - 49),
                Middle-Aged Adult (50 - 54),
                Very Young Senior Citizen (55 - 64),
                Young Senior Citizen (65-74)
                 Senior Citizen (75 - 84),
                Old Senior Citizen (85+)
                if age>120 or less than 0 ==> invalid entry*/
        int age = 100;
        String ageGroup = " ";

        if (age <=3 && age >0) { ageGroup = "Baby";}
           else if (age >= 3 && age <= 5) {ageGroup = "Toddler";}
         else if (age >= 6 && age <= 9) { ageGroup = "Kid";}
         else if (age >= 10 && age <= 12) { ageGroup = "pre-teen";}
         else if (age >= 13 && age <= 17) { ageGroup = "Teenager";}
         else if (age >= 18 && age <= 20) { ageGroup = "Young Adult";}
         else if (age >= 20 && age <= 39) { ageGroup = "Adult";}
         else if (age >= 40 && age <= 49) {ageGroup = "Yang Middle-Aged Adult";}
         else if (age >= 50 && age <= 54) { ageGroup = "Middle -Aged Adult";}
         else if (age >= 55 && age <= 64) { ageGroup = "Very Young Senior Citizen";}
         else if (age >= 65 && age <= 74) { ageGroup = "Young Senior Citizen";}
         else if (age >= 75 && age <= 84) { ageGroup = "Senior Citizen";}
         else if (age >= 85 && age <= 150) { ageGroup = "Old Senior Citizen";}
         else { ageGroup = "Invalid Entry";}
         System.out.println(ageGroup);
        System.out.println("============================================================");

        boolean eligibleToBuy= ageGroup=="Adult" ||ageGroup== "Young Middle-Aged adult"||ageGroup=="Middle-Aged Adult";
          if (eligibleToBuy){ System.out.println("You are eligible ");}
         else{ System.out.println("You are not eligible");}

    }
}



















