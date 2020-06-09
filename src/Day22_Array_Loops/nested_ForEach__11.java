package Day22_Array_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class nested_ForEach__11 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int each : arr) {
            System.out.print(each);
        }
        System.out.println();
       int[][]arr2D={{1,2,3},{4,5,6}};
        for(int[] each1Darray: arr2D){
           for(int eachElemet:each1Darray)

            System.out.print(eachElemet+" ");
        }
        System.out.println("========================");
        char[][] ch2D={{'A','B'},{'C','D','E'},{'F','j','H'} };

        for(char[]each1DArray : ch2D){
            for(char eachElement: each1DArray)

            System.out.println(eachElement);
        }

    }}
