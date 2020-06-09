package Day11_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //13 //Enter

    /*Scanner method:
        next(): returns string(onlytakes the firs word)
        nextLine():TAKES EVERY THINK THE SCANNER HAS, EVEN THE "ENTER"
        declare the scanner:
        Scanner veriablerName=new Scanner(System.in);
        we  call the methods of the
         */
        //System.out.println("Enter your name");
       // String name=input.next();               //Enter+Enter+Enter+Rabia
        System.out.println("Enter some nnumber");
        int num=input.nextInt();                  //13
        System.out.println(num);

        input.nextLine(); //Enter                //used for taking out the "Enter

        System.out.println("Enter your name: ");
        String name=input.nextLine();
        System.out.println(name);





    }
}