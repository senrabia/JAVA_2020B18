package Day21_MultiDeminasionalArray;

import java.sql.SQLOutput;

public class AverageNumber {
    public static void main(String[] args) {
        /*1. write a program that can return the average number from an array of integers
        ex:
				[1,2,3]
        average: 2
                [10, 15, 5, 6]
        average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
        average: 10*/


        int[] arr = {10, 20, 30, 40, 50, 60, 70, 50, 40, 25};  //5,10
        //  average:num of all numbers / length
        int length = arr.length; //total number of elements
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int eachNum = arr[i];
            sum += eachNum;
        }
        System.out.println(sum);
        System.out.println(sum / length);
        System.out.println("======================");

        double[] arr1 = {1, 2, 2,5,10,6,12};  //5, 10
        // average: sum of all numbers / length
        double length1 = arr1.length; // total number of the elements
           int length2 = arr1.length; // total number of the elements
        System.out.println(length1);
        System.out.println(length2);

        double sum1 = 0;

          for (int i = 0; i < length; i++) {
               double eachNum=arr1[2];
                sum+=eachNum;}
            System.out.println();



        }
    }
