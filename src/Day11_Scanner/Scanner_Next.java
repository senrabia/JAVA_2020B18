package Day11_Scanner;
//import PackageName.clasName

import java.util.Scanner;

public class Scanner_Next {
    public  static void main(String[] args) {
       /*Scanner method:
        next(): returns string(onlytakes the firs word)
        nextLine():TAKES EVERY THINK THE SCANNER HAS, EVEN THE "ENTER"
        declare the scanner:
        Scanner veriablerName=new Scanner(System.in);
        we  call the methods of the
         */
        Scanner input=new Scanner(System.in);
         // String str=scan.next();
         // System.out.println(str); //only takes first word
        //7921 Jones Branch Dr, McLean VA,22034
        String fullAdress="";
        System.out.println(" Enter the number of the building:");
        short buildN=input.nextShort();
            fullAdress+=buildN+ " ";//full adress=fullAdress+buildN
        System.out.println("Enter the Street Name: ");
        String streetName=input.next();
        fullAdress+=streetName+"";

        System.out.println(" Enter the type of the road");
        String roadType=input.next();
        fullAdress+=roadType+", ";

        System.out.println(" Enter city name, state, zipcode");
        String cityName=input.next();
        fullAdress+=cityName+"";

        String state=input.next();
        fullAdress+=state+", ";

        int zipCode=input.nextInt();
        fullAdress+=zipCode;

        System.out.println("Adress is: "+fullAdress);

















    }
}
