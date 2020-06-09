package OfficeHours.Practice04_22_2020;

public class TaskSolution {
    /*warmup task:
    1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array*/

    public static void main(String[] args) {
        int[]arr={100,200,10,45,55,};
        int max= MaxNum(arr);
        System.out.println(max);
//=========================================
        double[]arr1={10.0,20.0,10,45.5,555.5,};
        double max1= MaxNum1(arr1);
        System.out.println(max1);}

    public static int MaxNum(int[]arr) {
        int max=199;
        for(int i=0; i<arr.length; i++){
            int num=arr[i];
             if(num>max){max=num;}}
             return max;
    }
    public static double MaxNum1(double[]arr1) {
        double max1=199.0;
        for(int i=0; i<arr1.length; i++){
            double num1=arr1[i];
            if(num1>max1){max1=num1;}}
        return max1;
    }




}
