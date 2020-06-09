package Day30_ArrayList;

import PracticePractice.Note.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class FindMaxMin_Excesize {
 //   public static void main(String[] args) {


            /*    Scanner input = new Scanner(System.in);
                int[] inhabitants = new int[8];

                int[]extinct={0,0,0,0,0,0,0,0};
                int day=0;

                for(int i=0; i<inhabitants.length; i++) {
                    inhabitants[i] = input.nextInt();
                }
                while (!(Arrays.equals(inhabitants,extinct))) {
                    System.out.println("Day" + day + " " + Arrays.toString(inhabitants));

                    for (int i = 0; i < inhabitants.length; i++) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                    day++;

                }
                System.out.println("Day"+day+" "+Arrays.toString(inhabitants));
                System.out.println("---------- EXTINCT ---------");
            }
        }*/
   //176 owerloading=======================
         /*   public int findMax(int[]arr){
                Arrays.sort(arr);
                int max=arr[arr.length-1];
                return max;
            }
            public double findMax(double[]arr1){
                Arrays.sort(arr1);
                double max=arr1[arr1.length-1];
                return max;
            }

        }*/
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String sentence = input.nextLine();

                String reversed = "";

                String[] word = sentence.split("");
                for (int i = 0; i < 0; i++) {
                    System.out.println(word.length);
                }
                for (int i = word.length - 1; i >= 0; i--) {
                    reversed += word[i];
                    //reversed=reversed.substring(0,reversed.length()-1);}

                }
                    System.out.println(reversed);

            }}