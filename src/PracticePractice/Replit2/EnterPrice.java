package PracticePractice.Replit2;

import java.util.Scanner;

public class EnterPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
what is the farthest planet in the solar system:a)venusb)plutoc)neptune
a
a is wrong
what is the farthest planet in the solar system:a)venusb)plutoc)neptune
b
b is correct
what is the farthest planet in the solar system:a)venusb)plutoc)neptune
c
c is wrong
what is the farthest planet in the solar system:a)venusb)plutoc)neptune
z
z is not a valid answer*/
       // String a="";
       // String b="";
       // String c="";
       // String z="";

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        String answer = scan.nextLine();
        System.out.println(  " b is correct");
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        String answer1 = scan.nextLine();
        System.out.println("c is wrong");
        scan.nextLine();
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        String answer2 = scan.nextLine();
        System.out.println("a is wrong");
        scan.nextLine();
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        String answer3= scan.nextLine();
        System.out.println("z is not valid number");




        }
    }
