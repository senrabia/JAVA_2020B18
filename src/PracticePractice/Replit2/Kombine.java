package PracticePractice.Replit2;

import java.util.Arrays;

public class Kombine {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        System.out.println(Arrays.toString(x));
        int[] y = {4, 5, 6}; //int[]y={4,5,6} eger bu sekilde olursa out of bound num
        //row and column it can befor making combine.
        System.out.println(Arrays.toString(y));
        int[] z = new int[x.length + y.length];//can contein all the elemennts from arr1 and array2
        System.out.println((Arrays.toString(z)));

        for (int i = 0; i < x.length; i++) {
            x[i] = x[i];
        }

        for (int i = 0; i < y.length; i++) {
            z[x.length + i] = (i);
            z[i] = x[i] + y[i];
        }
        System.out.println(Arrays.toString(x)+Arrays.toString(y));
    }
}

