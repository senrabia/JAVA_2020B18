package KizlarCaySaati;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
         /*1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"  */
        Scanner input=new Scanner(System.in);

        String str = "AABCCEF";

        String result = " ";   //"B"
         //ch yerine str char kullanilabilir.
        for (int j = 0; j <= str.length() - 1; j++) {
            char ch2=str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char ch=str.charAt(i);
                if (ch== ch2) {
                    count++;   //ingreased by =>1
                } }
            if (count == 1) {    //if unique
                result += ch2;
            } }
        System.out.println(result);
    }
}


