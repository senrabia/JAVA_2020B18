package Day17_WhileLoop;

import Day7_If_Statem.MinNumber;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
      /*  1. write a program that can ask the user "enter a number" five times and return the maximum number
        hint: you will nedd for loop and if statement
        2. write a program that can ask the user "enter a number" five times and return the minimum number
        hint: you will nedd for loop and if statement*/
        Scanner input=new Scanner(System.in);
        int MaxNumber=-2147483648;// any number the user provided will provided will be grater
       // than this number.
        //MaxNumber=5;
        int MinNumber=2147483647;
        //MinNumber=0;
        for( int i=1; i<6; i++){ //i:1,2,3,4,5
        System.out.println("Enter a number");
        int num=input.nextInt();  // 0,1,2,3,4

        if(num>MaxNumber){// to compare each user inputs, and assign the maaximum number to maxNumber333
            MaxNumber=num;
      }
        if (num<MinNumber){
            MinNumber=num;
        }

    }
        System.out.println("Maximum Number "+MaxNumber);
        System.out.println("Minimum Number "+MinNumber);
   }
}