package PracticePractice.Note;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //========   array utulities  ===========
        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr); // ARray bMUST be converted to string before we print


        String names[] = {"Madina", "Fatih", "Osman"};
        System.out.println( Arrays.toString(  names  )  );


        double[] nums = {10, 20, 30 , 40, 50};
        System.out.println( Arrays.toString( nums )  );
        System.out.println( nums[0] + 1  );
        //===========  array  equals  ==============

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3,4};

        boolean result4 = Arrays.equals(array1, array2);  // false
        System.out.println(result4);
     //============ sorting array  =================
     //============ buyukten kucuge sira ===========
        int[] arr2 = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr2);
        int[] arrDesc = new int[arr2.length];  //[0, 0, 0, 0, 0, 0, 0, 0]


        Arrays.sort(arr2); // [-100, -1, 1, 3, 4, 100, 155, 200]
        // index:   0    1  2  3  4  5     6    7
        int k = 0;
        for(int i = arr2.length-1; i >= 0; i-- ){
            arrDesc[k] =  arr2[i];
            k++;
        }

        System.out.println(  Arrays.toString(arrDesc)  );}

        //===============  kombine two arrays ===============

        /*int[] array1 = {1,2,3,4,5,6,7,8};
          int[] array2 = {9,10,11,12, 13, 14, 15};
          //int[] arr1 = {1,2,3};
         //int[] arr2 = {4,5,6,7};

        int[] arr3 = new int[array1.length + array2.length]; // can contain all the elemnts from array1 and array 2

        for(int i = 0; i <array1.length ; i++ ){
            arr3[i] =  array1[i];
        }


        for(int i= 0; i < array2.length; i++ ){
            arr3[array1.length+i]     =   array2[i];
        }
      System.out.println( Arrays.toString(arr3)  );                                        */

        //=================  days java =====================

       /* Scanner input=new Scanner(System.in);

        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};  // size: 7,  max index: 6
        System.out.println("Enter a number: ");
        int num  =  input.nextInt();  // 18

        int attepmts = 1;
        while(num >7 || num < 1) {

            System.out.println("Invalid Entry, please re enter the number");
            num = input.nextInt();  // 6
            attepmts++;

            if (attepmts == 3 && (num > 7 || num < 1)) {
                System.exit(0);
            }
            String result = days[num - 1];
            System.out.println(result);

        }  TEK SAYFADA CALISACAK                                         */


    }