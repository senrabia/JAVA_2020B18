package Day21_MultiDeminasionalArray;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {
        /*multi-dimentional array:a variable that can contain array.n dimensional array MUST contain(n-1) dimentional arrays.
        TWO DIMENTIONAL ARRAY FORMULA==> 2 dimentional array contain 1 dimentional array.
               int[] arr1D= {1,2,3}  //single dimesional array
           ==> int[][] arrayName={  {1,2,3},{4,5,6} };
                     //                0   ,   1
           each single dimensional arrays are index of the 2D array.
           [ index number of each 1D array ][index num of each value in 1D array]
           arrayName[0] [1]==>2
           arrayName[1] [2]==>6
           */


        int[]arr={1,2,3};
        // index number 0 1 2    0 1 2 3
        int[][]arr2D={ {1,2,3} ,{4,5,6,7} };
        //               0     ,    2
        System.out.println(arr2D.length);
        int[] arr1D=arr2D[0];     //{1,2,3}; just give me single dimensional array.
        System.out.println(Arrays.toString(arr1D));
        int num1= arr2D[1] [3];
        System.out.println(num1);
        //CHAR ARRAY======================

        //{'A', 'B'
        //                0    1     0    1   3
        char[][]ch2D={  {'A', 'B'},{'D','E','F'},{'G','H','I'}};
        // index number     0           1
        char ch1= ch2D[1][0];
        System.out.println(ch1);

        char[] ch2=ch2D[2];  //G H I
        System.out.println(Arrays.toString(ch2));
        //  ROW NUMBER      0    1   2     0    1   2     0   1   2
        String[][] str2D={{"A","B","C"}, {"D","E","F"},{"J","H","I"}};
        //  COLON NUMBER       0              1             2
        String r1=str2D[1] [1];
        System.out.println(r1);

    }
}
