package Day14_StringClass2;

import java.util.Scanner;

public class Credentials2_ {

    /* valid credentials are:
       username:cybertek
       password:cbertekschool
       ==>>precondition: username and password cannat be empty
                    if they are empty
       if user entered both valid username and password ==>log in
       if valid passwor, invalid username ==> username is incorrect
       if valid user name, invalid password==> password is incorrect
       if both password and username are innvalid ==> invalid username and password
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputPassWord = input.next();
        boolean logedIn = inputUserName.equals("Cyebertek") && inputPassWord.equals("cybertekschool");//user entered both valid username and password.
        boolean invalidUserName = !inputUserName.equals("Cyebertek") && inputPassWord.equals("cybertekschool");//user entered invalid username and valid password.
        boolean invalidPassword = inputUserName.equals("Cyebertek") && !inputPassWord.equals("cybertekschool");//user name is valid , nbut password is invalid.


        if (!inputUserName.isEmpty() && !inputPassWord.isEmpty()) { //username and password are not empty
            if (logedIn) {
                System.out.println("Logged in");}
             else if (invalidUserName) {
                System.out.println("password is correct, username is in correct");}
            } else if (invalidPassword) {System.out.println("Username Is correct, password is incorrect");
        }else
          { System.out.println("please enter the credentials");}
    }
}







