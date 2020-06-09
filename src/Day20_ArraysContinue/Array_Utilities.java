package Day20_ArraysContinue;
import java.util.Arrays;
public class Array_Utilities {
    public static void main(String[] args) {
        /* ARRAYS UTILITIES COVER MANY
        Arrays Utilities:
         Arrays class:presented in "java.util"
                      import PackageName.className;
                      import java.util.Arrays;
          Arrays.toString(arrayName): converts to arrays
           */

  int[]arr={1,2,3};
  String r=Arrays.toString(arr);

        System.out.println(r);
        System.out.println(arr);//Array MUST be converted to string brfore we print

        String names[]={"Madina","Fatih","Osman"};
        System.out.println(Arrays.toString(names)); //if we did not write real result. it can be convert ARRAYS
        System.out.println( Arrays.toString(  names  )  );


        double[] nums = {10, 20, 30 , 40, 50};

        System.out.println( Arrays.toString( nums )  );

        System.out.println( nums[0] + 1 );








    }
}
