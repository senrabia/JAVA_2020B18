package Day24_Methods.Methods;

import java.util.Scanner;

public class Task {
    public static void Age(short birthYear) {  //2000
        Scanner scan = new Scanner(System.in);

        int currentYear = 2020;//How can the find birth year???
        int age = currentYear - birthYear;

        if (age < 0 && birthYear > 1900) {
            // if(birthYear<currentYear){   //IMPORTANT==> if we dont used here there is a BUG

            System.out.println(age);
        } else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        //  int a=2002;
       //BURAYI INCELE???   Age(2030);        //We cant assign bayte and int we can used ()
//Do we have a any bug  ??? yes it is... if we used 2030 give me a -10

//IMPORTANT==> What I have a two custom method??????

    }

    public static void printHello() {
        System.out.println("Hello");

    }

    public static void printCybertek() {
        System.out.println("Cpybertek");


}
    public static void printHelloCybertek() {
        printHello() ;     //Hello
        printCybertek();   //Cybertek
    }



}




