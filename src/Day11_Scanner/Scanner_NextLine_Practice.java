package Day11_Scanner;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //  7925 JonesBranch DR, McLean VA, 22034
        //  fullAdress:Building-number Street, city, state zipcode

        System.out.println("Building number: " );
        int numberB=input.nextInt();    //7925

        System.out.println("Building number: "+numberB );

        input.nextLine();              //used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street=input.nextLine();

        System.out.println("Street: "+street);

        System.out.println("Enter the zip code:");
        int zipCode=input.nextInt();    //22033

        input.nextLine();              // take out the Enter
        System.out.println(" Enter the city name and state seperated by comma and space");
        String cityState=input.nextLine();

        String fulladress=numberB+",\n "+street+" "+zipCode;
        System.out.println(fulladress);
        input.close();

    }
}
