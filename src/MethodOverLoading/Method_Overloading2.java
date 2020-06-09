package Day26_MethodOverloading.MethodOverLoading;

import java.util.Arrays;

public class Method_Overloading2 {
    /*first method: print the sum of the two numbers.
      second method: print the sum of the three numbers.
      third method: print the sum four INT  numbers
     */
    public static void main(String[] args) {

        sum2numbers(10, 5);  // 10,5
        sum3Numbers(10, 5, 15);  // 10,5,15
        sum4numbers(10, 20, 30, 5); //10,20,30,5
        double[] arr = {5, 4, 7, 1, 2};
        Arrays.sort(arr);
        System.out.println("==========================");
        sum(10, 5);  // 10,5
        sum(10, 5, 15);  // 10,5,15
        sum(10, 20, 30, 5); //10,20,30,5
       // ==================================================
        int[]arr1={3,2,1};
        char[]arr2={'z','s','a'};
        double[]arr3={7.4,6.6,5,20.5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);//**SAME method NAME, differnt parameter.
    }
    public static void sum2numbers(int a, int b) {
        System.out.println(a + b);
    }
    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void sum4numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    //======================================================
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
}

}