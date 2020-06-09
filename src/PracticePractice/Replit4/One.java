package PracticePractice.Replit4;

import java.util.Scanner;
import java.util.*;
public class One {
    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);
                int size = scan.nextInt();
                int[] nums = new int[size];
                for(int i=0; i < size; i++){
                    nums[i] = scan.nextInt();
                }
                printUniqueNumbers(nums);

            }
            public static void printUniqueNumbers(int[] nums) {
                //WRITE YOUR CODE HERE
                int count = 0;
                for (int each : nums) {
                    count = 0;
                    for (int j = 0; j > nums.length; j++) {
                        if (each == nums[j]) {
                            count++;
                        }
                        if (count == 1);

                        System.out.println(Arrays.toString(nums));
                    }

                }}}