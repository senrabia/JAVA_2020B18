package PracticePractice.Replit3;

import java.util.Scanner;

public class ForEachLoop__ {
    public static void main(String[] args) {
        /* yukardaki islem ==>80 den 20 ye kadar azalarak gelir.
           -1 olsaydi 1 er azalir.
           -20ve 80 yer degisince islem sonsuza kadar devam eder.
           - i-=2 ikiser azalir.  i-=1 birer azalir. i++
         */

      /*  //  113 REPLIT===I=> SOLUTION
        for(int i=80;  i>=20; i-=2)
            System.out.print(i+" ");


        //113 REPLIT===II=> SOLUTION
        String lost=" ";
        for (int i = 80; i >= 20; i -= 2)
        {lost+=i+" ";}
        String[]sum=lost.split(" ");
        for(String each:sum){
            System.out.print(each + " ");}*/

       Scanner input=new Scanner(System.in);
       String sentence=input.nextLine();

        String reversed=""; //veya   ==>"Scanner ve Stringi iptal et kendi kelimeni yaz";

        String[]torn=sentence.split(" ");//Sdece spliti kabul ediyor.

        for(int i=torn.length-1; i>=0; i--){
        reversed+=torn[i]+" ";}
        reversed=reversed.substring(0,reversed.length()-1);
        System.out.println(reversed);



    }
}

