package day12_ScannerClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClass {
    /* nextByte():returns the input as byte primitive
       nextSgort():returns the input as short primitive
       NextInt():returns the input as int primitive
       nextLong():returns the input as long primitive
       nextFloat():returns the input as float primitive
        nextDouble():returns the input as float primitive
      nextBoolean();returns the input as boolean primitive
      next():Returns the userinput as String
       ONLY THE FIRST WORD"TODAY IS GREAT DAY"==>TODAY
       next line():TAKES EVERYTHING IN THE SCANNER ,EVEN THE "ENTER"KEYWOARD

    ONLY whole number design==>byte, short,int, long
    -float can be assigned to double
    -never casted Big one small==>but small one otomaticily casted
    -long=> (long)input.nextFloat();//float can be assigned to double

    * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//RUULS scan yerine any name used.
       //int a=9999999999;
        System.out.println((long)2.5);//This is Whole num just return==>2
        System.out.println("Enter a long number:");// int a=input.nextLong();EROR because int==>long need casting
        long a=input.nextLong();
        System.out.println("You have enterd:"+a);

        System.out.println("Enter a decimal:");
        float b=input.nextFloat();//Float can be assigned to double
        // long=> (long)input.nextFloat();// float can be assigned to double

        System.out.println("You have a enterd"+b);

        System.out.println("Enter a decimal number:");
        double f=input.nextDouble();
        System.out.println("You have entered"+f);

        System.out.println("Enter true or false");
        boolean bool=input.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter your sentence:");









    }


}
