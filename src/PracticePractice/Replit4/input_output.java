package PracticePractice.Replit4;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
       /* for(int i=20; i<=80; i++){
            if(i%2==0){
                System.out.print(i+" ");

            }
        }

        }
    }*/
       Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int count=0;
        for(int a=0; a<=7; a++){
            for(int b=0; b<7; b++){
                if(nums[a]==nums[b]) {
                    count++;}
                    if (count == 1) {
                        System.out.println(nums[b]);
                    }
                }}}}







