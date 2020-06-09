package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Multi_DimensionalArray__5 {
    public static void main(String[] args) {

        int[]arr1D={1,2,3};
        int[][]arr2D={{1,2,3} , {4,5,6,7}  };
       // [index num of 1D Array][index  num of elements]
       //{4,5,6,7}
        System.out.println(arr2D[1]);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][3] );
        System.out.println(arr2D[1][0] );
        System.out.println(Arrays.toString(arr2D));
    }


}
