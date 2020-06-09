package Day10_SwichStatement;
import java.util.Scanner;

public class Scanner_Practice1 {
    /*Write a program that ask user to enter num1 and num2
    ==>byte, short,int,long kullanilabilir


     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number:");
        byte num1=input.nextByte();
        System.out.println("Enter your second number:");
          byte num2= input.nextByte();

        System.out.println("The sum of those two numbers are:"+(num1+num2));
        //+num1+num2 grup yapmazsak gercek sonumcikmaz(+num1+num2)
        //veya ("The sum of "+num1+"and'+num2+"is:"+total); olabilir



    }
}
