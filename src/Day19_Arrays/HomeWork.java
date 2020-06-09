package Day19_Arrays;


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        //write a program that asks "enter a name" 10times, and store each of the names in the array students.

        String[]students=new String[10];
        //{"Nancy","Aynur","Ozlem","Maria","Derya","Meryem","Zuhal","Leyla","Koray","Bilge"};
        //MAX=>       0        1        2      3        4        5      6      7       8       9
        System.out.println(students.length);

                for (int i=0;i<=students.length-1;i++){
                   System.out.println("Enter name");
                   students[i]=scan.next();}
                System.out.println("All students name list :");
                for(int i=0;i<=students.length-1;i++){
                    System.out.println((i+1)+")"+students[i]);}
        System.out.println("=======================================");
                students[0]="Aynur";
                students[2]="Maria";
                students[1]="Ozlem";
                students[3]="Derya";
                students[5]="Zuhal";
                students[4]="Meryem";
                students[6]="Zuhal";
                students[9]="Bilge";
                students[7]="Leyla";
                students[8]="Koray";

        System.out.println(students[1]);
        System.out.println(students[0]);
        System.out.println(students[3]);
        System.out.println(students[6]);
        System.out.println(students[9]);
        System.out.println(students[2]);
        System.out.println(students[4]);
        System.out.println(students[5]);
        System.out.println(students[7]);
        System.out.println(students[8]);

        System.out.println("===========================================");
        for(int i=0; i<=3; i++){
            String student=students[i];
            System.out.println(student);}



    }
}
