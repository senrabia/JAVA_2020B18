package Day22_Array_Loops;

import java.util.Arrays;

public class Multi_Arrays__7 {
    public static void main(String[] args) {
        /* ***DEEP TO ARRAY *** bu konuda devreye giriyor.
          => n dimensional array contains (n-1)dimensional Arrays.
          =>2D array: [index of 1D array][index numof elements]
              Array.toString():converts any single demintional array to string
         **** Array.deeptoString():converts any multi-demintional array to string

         */
        int[]arr1D={1,2,3};
        int [][]arr2D={   {1,2,3}   ,  {4,5,6}  };
        int[] ar1D=arr2D[0]; //{1,2,3}

        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));//single dimentional array  from==> arr2D
        System.out.println(arr2D[0][2]);  //3   jast give me ELEMENT
        System.out.println(Arrays.deepToString(arr2D));
       // System.out.println(Arrays.deepToString(arr2D[1]));
        //EASY WAY=======V=================
        for(int eachElement:arr2D[0]){
            System.out.println(eachElement);
        }for(int i=0; i<arr2D[0].length; i++){
             int num=  arr2D[0][i];
            System.out.println(num);
        }


    }
}
