package PracticePractice.Note;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {
       /* // ==============  ARRAY UTULITIES (INDEX) =========
        // ==================  max-min  ====================
        int[] arr = {10, 6, 1, 1000, 200};
        int lastindex = arr.length - 1;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= lastindex; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    } //max1 give me a maximum*/

      //============== =================================
             String[]months= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
      "Aug","Sep","Oct","Nov","Dec"};
             Scanner input=new Scanner(System.in);
             System.out.println("Enter a number");
             int num=input.nextInt();

             while(num>12 || num<=0){
                 System.out.println("Invalid Entry");
                 System.out.println("Please re-enter the number");
                 num=input.nextInt();}//12
                 String result=months[num-1];
                 System.out.println(result);
             }}


