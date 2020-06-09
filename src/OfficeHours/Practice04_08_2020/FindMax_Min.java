package OfficeHours.Practice04_08_2020;

import java.util.Scanner;

public class FindMax_Min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int max=-214748367;
        int min=214748367;
        int i=1;
        while(i<=5){
            System.out.println("Enter a number");

            int num=input.nextInt();  //0,-5, 10
            if(num > max){//whichever the userinput is larger
                max=num;
            }
            if(num < min){//whichever the userinput is smaller
                min=num;
            }
            i++;
        }
        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);
    }
}
