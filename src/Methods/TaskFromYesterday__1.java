package Day24_Methods.Methods;

import java.util.Arrays;

public class TaskFromYesterday__1 {
    /*AccesModifier Specifier return-Type methodName(Parameter)
     1. creata a function that can print the maximum number from any given array
     2. creata a function that can print the minimum number from any given array
     3. create a function that can print out the array in descending order
         [1,2,3] == > [3,2,1]*/


    public static void Decending(int[] array) { //{100,200,-100};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }//   3 2 1
        System.out.println();
    }

    public static void MaxNumber(int[] array) { //1 question
        Arrays.sort(array);  //acsending order
        System.out.println("Maximum number is: " + (array[array.length - 1]));
    }

    public static void MinNumber(int[] array) {   //2 question
        Arrays.sort(array);  //acsending order
        System.out.println("Minimum nuber is: " + array[0]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 9, 5, 4, 2, 1};
        // MaxNumber(10);     //10, if parameter is array, the aargument MUST be array.
        MaxNumber(arr);
        MinNumber(arr);
        int[] arr2 = {100, 20, 30, 40, 40, -100};
        MaxNumber(arr2);
        MinNumber(arr2);

        Decending(arr2);
    }

    public static void Descending(int[] array){ // {100, 200, -100};

        Arrays.sort(array);

        for(int i = array.length-1; i>=0; i-- ){
            System.out.print(array[i] +" ");
        }
        // 3 2 1
        System.out.println();
    }


}


