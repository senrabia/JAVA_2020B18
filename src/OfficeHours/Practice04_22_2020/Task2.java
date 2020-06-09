package OfficeHours.Practice04_22_2020;

public class Task2 {
   /* NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array*/

    public static void main(String[] args) {
        int[] arr= {7,45,350,12,3}; //Min int
        int min=  minNum(arr);
        System.out.println(min);
//======================================
        double[]arr1={3.7,35.5,12,}; //Min double
        double min1=minNum1(arr1);
        System.out.println(min1);}

    public static int minNum(int[]arr) {
        int min=7;
        for(int i=0; i>arr.length-1; i++){
            int num=arr[i];
                if(num<min){min=num;}}
                    return min;}

    public static double minNum1(double[]arr1 ) {
        double min1 = 7.5;
        for(int i = 0; i < arr1.length - 1; i++) {
            double num1 = arr1[i];
            if (num1 < min1) { min1 = num1; } }
                 return min1;
    }}
