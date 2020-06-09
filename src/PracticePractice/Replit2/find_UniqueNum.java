package PracticePractice.Replit2;

import java.util.Scanner;

public class find_UniqueNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;
        for(int i=0; i<7; i++){
            count=0;
            for(int j=0; j<7; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count!=2){
                System.out.println(nums[i]);}}}}
/*
       int count1=0;
       for(int j=0; j<7; j++) {
           count1 = 0;
           for (int k = 0; k < 7; k++) {
               if ((i) == (j)) {
                   count1++;
               }
           }
           if (count1 == 1) {
               System.out.println(count);
           }
       }}}}*/



