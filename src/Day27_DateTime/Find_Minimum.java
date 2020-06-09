package Day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {
       /* Warmup task:
        1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
        NOTE: apply method overloading,  DO NOT USE SORT METHOD.*/
        int[] arr = {5, 4, 7, 5};  //4
        int minimum = arr[0];// System.out.println(minimum); //5
        for (int each : arr) { //ieterete 4 time=>5,4,7,5
            if (each < minimum) {
                minimum = each;//4 //if we add + is that give me whole num
            }
        }
        System.out.println(minimum);
 //====================================================
        int[] arr2={100,2000,3000,40,50,-100,-9000};
        System.out.println( minimum(arr2));
//======================================================
        double[]arr3={55.,10.5,1.5,2.5,0};
        double num1=minimum(arr3);
        System.out.println(num1);
    }
    public static int minimum(int[]arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;//4
            }
        }
        return minimum;}

    public static double minimum(double[]arr) {

            double minimum = arr[0];
            for (double each : arr) {
                if (each < minimum) {
                    minimum = each;//4
                }
            }
            return minimum;}
    }



