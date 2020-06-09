package Day22_Array_Loops;

import java.util.Arrays;

public class Decending__4 {
    public static void main(String[] args) {
       /* 1. write a program that sort the array in descending(Azalan) order
          2.reverse
        */
       //KUCUKTEN BUYUGE SIRALAMA
       int[] arr={10,78,2,-1,500,70};
        Arrays.sort(arr); //sorts in accending
        System.out.println(Arrays.toString(arr));

        //BUYUKTEN KUCUGE SIRALAMA
        int[]RevArr=new int[arr.length];
        int j=arr.length-1;
        for(int i=0; i<arr.length; i++){
            RevArr[i]=arr[j]; j--;}
        System.out.println(Arrays.toString(RevArr));

    }
}
