package PracticePractice.Replit3;

import java.util.Scanner;

public class CalismaAksam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    String a = "I love Java";

        System.out.println(a.length());          //if we used length
        System.out.println(a.contains("Java"));  //what is the contain inside.
        System.out.println(a.substring(5,11));   //numarayla belirtilir baslangic ve bitis arasindaki harf veya bosluk.

    boolean exists=true ;
     String word = scan.next();

     if(word.contains("java")&&
             (word.substring(0,4).equalsIgnoreCase("java"))||
             ( word.substring(1,5).equalsIgnoreCase("java"))){
         exists=true;
     }else{exists=false;}
        System.out.println(exists);

      /*  if (word.contains("java") &&
                (word.substring(0,4).equalsIgnoreCase("java") || word.substring(1,5).equalsIgnoreCase("java"))) {
            exists = true;
        }else{
            exists = false;
        }

        System.out.println(exists);*/



    }
    }

