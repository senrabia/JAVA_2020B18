package Day14_StringClass2;

import java.util.Scanner;

public class StringManipulation_Credentials {
    /*USER NAME AND ;PASSWORD
    userName:cyabertek
    pasword:cybertekschool

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        System.out.println("Enter your username");
        String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputPassWord = input.next();
        boolean validCredential=inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord);

        if(validCredential) {                      //(inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord)) {
            System.out.println("Log in succesfully");
        } else {
            System.out.println("Invalid credentials");
        }


    }
}













