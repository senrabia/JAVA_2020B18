package KizlarCaySaati;

import java.util.Arrays;

public class Arraylar22Nisan {
    public static void main(String[] args) {
        int []arr1={3,2,1,0};
        int lengindex=arr1.length-1;
        System.out.println(Arrays.toString(arr1));
        for(int i=0; i<=arr1.length; i++){
        }
        int []arr1D={1,2,3};
        int [][] arr2D={{1,2,3}, {4,5,6,7}};
        //[index num of 1DArray] [Index num of elemnets]
        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));//it give me //4,5,6,7
        System.out.println(arr2D[1][3]);//7
        System.out.println(arr2D[1][0]);//4
        System.out.println(Arrays.deepToString(arr2D));//Whole Array

    }

}


