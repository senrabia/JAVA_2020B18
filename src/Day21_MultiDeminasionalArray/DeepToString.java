package Day21_MultiDeminasionalArray;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        /*3 dimensional arrays can contain 2 dimentional array:
        FORMULA ANY DIM.ARRAY V
         ==>int[] [] [] arr3D={};
         ==>[index numof 2D Array][index numof 1Darray][index num of Eleements]
          ==>Arrays.ToString(arrrayName): only for single dimensional array
          ==>Array.deepToString(array)
         */


        int[] arr1D={1,2,3};
        System.out.println(Arrays.toString(arr1D));
        int[][] arr2D={ {1,2,3} , {4,5,6} };
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));
        //                     0       1
        int[][][] arr3D={ { {1,2,3},{4,5,6} }, { {7,8,9},{10,11,12} }};
        //                        0                     1
        System.out.println(Arrays.deepToString(arr3D[1]) );
        System.out.println(Arrays.toString (arr3D[0][1]) );
        System.out.println(             arr3D[1][1][2] );

    }
}
