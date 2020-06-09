package PracticePractice.Replit4;

import java.util.Scanner;
public class Practice_String_Manip {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);



                String email = scan.next();
                String firstName=email.substring(0,1).toUpperCase()+(email.substring(1,5).toLowerCase());
                String lastName=email.substring(6,7).toUpperCase()+(email.substring(7,15).toLowerCase());
                String domain=email.substring(16,21);
                String level=email.substring(22,25);

        System.out.println("First name: \n"+firstName);
        System.out.println("Last name: \n"+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+level);


      /*  String email="scott_forstall@apple.com";
        String firstName=email.substring(0,1).toUpperCase()+(email.substring(1,5).toLowerCase());
        String lastName=email.substring(6,7).toUpperCase()+(email.substring(7,15).toLowerCase());
        String Domain=email.substring(16,21);
        String level=email.substring(22,25);
        System.out.println("First name: \n"+firstName);
        System.out.println("Last name: \n"+lastName);
        System.out.println("Domain: "+Domain);
        System.out.println("Top-Level Domain: "+level);*/


    }
}
