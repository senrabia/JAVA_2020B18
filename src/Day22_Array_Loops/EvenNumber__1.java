package Day22_Array_Loops;

import java.util.Arrays;

public class EvenNumber__1 {
    /*  1. create an int array called numbers that has length of 100
            2. assign 1~100 to the array' each indexes
            3. use for each loop to rpint out all the even numbers.
    MUst use continue statement*/
    public static void main(String[] args) {
      int[] numbers=new int[100];   //index:0~99
      /*numbers[0]=1;
      numbers[1]=2;
      .........
      numbers[100]=100;
       */

      for(int i=0; i<numbers.length; i++){ numbers[i]=i+1; }
      System.out.println(Arrays.toString(numbers));
     //II Formula============iven====odd=====
     for(int each:numbers)
     {if(each %2 !=0){ continue; }
         System.out.print(each+" ");
     }



    }
}
