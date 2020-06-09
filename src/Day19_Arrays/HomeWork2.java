package Day19_Arrays;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //write a program that asks "enter a name" 10times, and store each of the names in the array students.

        String[]students=new String[10]; //{"Nancy","Aynur","Ozlem","Maria","Derya","Meryem","Zuhal","Leyla","Koray","Bilge"};

        //MAX=>       0        1        2      3        4        5      6      7       8       9
        System.out.println(students.length);

        for (int i=0;i<=students.length-1;i++){
            System.out.println("Enter name");
            students[i]=scan.next();
        }
        System.out.println("All students name list :");
        for(int i=0;i<=students.length-1;i++){
            System.out.println((i+1)+")"+students[i]);


        }


    }
}
