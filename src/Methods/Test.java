package Day24_Methods.Methods;

import Resources.Library2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str="Cybertek";
        String RevStr= Library2.Reverse(str);
        System.out.println(str.equalsIgnoreCase(RevStr));
        int[]arr={100,300,200,40000,500000,10000000};
             arr= Library2.sortDesending(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


