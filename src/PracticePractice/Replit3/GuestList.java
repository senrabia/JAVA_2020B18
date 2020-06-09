package PracticePractice.Replit3;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String list = "";
        do {
            System.out.println("Please enter guest name:");
            name = input.next();
            list += name + ", ";
            System.out.println("Do you want to enter new guest name:");
            name = input.next();
        } while (name.equalsIgnoreCase("Yes"));
        if (name.equalsIgnoreCase("No")) {
            list = list.substring(0, list.length() - 2);
            System.out.println("Guest's list: " + list);
        }
        //IKINCI YOL
        String guestlist = "";
        System.out.println("Please enter guest name:");
        String firstname = input.nextLine();
        guestlist = firstname + ", ";
        for (int i = 1; i >= 1; i++) {
            System.out.println("Do you want to enter new guest name:");
            String yesOrno = input.nextLine();
            if (yesOrno.equalsIgnoreCase("yes")) {
                System.out.println("Please enter guest name:");
                firstname = input.nextLine();
                guestlist += firstname + " ";
            } else {
                System.out.println("Guest's list: " + guestlist);
                break;
            }

        }


    }}
