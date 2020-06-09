package Day17_WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Credentials {
    /*user:cybertek
    password:cybertek123
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter Pass Word");
        String password = input.next();

        boolean valid = !(username.equals("cybertek") && !password.equals("Cybertek123"));

        int count = 0;
        while (!valid) { // (!(username.equals("cybertek")&&!password.equals("Cybertek123"))){
            //!true
            System.out.println("Please re enter your credintions");
            System.out.println("Enter user name");
            username = input.next();

            System.out.println("Enter Pass Word");
            password = input.next();
            valid = (username.equals("cybertek") && password.equals("Cybertek123"));
            //validating new username and passvord
            count++;

            if (count == 3 && !valid) { //If ve did not edd this statement

                System.out.println("Your account is locked");
                break;
            }

            if (valid) {
                System.out.println("Logged in");
            }
        }
    }
}






