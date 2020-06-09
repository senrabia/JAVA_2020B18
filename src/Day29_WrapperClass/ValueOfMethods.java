package Day29_WrapperClass;

import PracticePractice.Note.Array;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";
        Integer a=Integer.valueOf(str); //Intiger,123
        System.out.println(a);

        double b= Integer.valueOf(str); //unboxing
        //double=Intiger
        System.out.println(b);
      //==========  parse or avalueOf =========
        String str2="15.5";
        double d1=Double.parseDouble(str2);//double =  double  //none
        double d2=Double.valueOf(str2);    //double = Double   //Unboxing

        System.out.println(d1); //15.5
        System.out.println(d2); //15.5
        System.out.println(d1==d2);
        System.out.println("=====================");

        int z1=2000;
       // Long L1=z1; // EROR does not accept any other primitives except for long

       Short sh1=3000;
       int z2=sh1;
       /*"True"
          "FalSe"
          "100000000.5" ==>to float
          "123456"  ==>to short
           */
       String r1="true";
       Boolean t1= Boolean.valueOf(r1); //Boolean, true
        //Boolean =Boolean              //none

        boolean t2=Boolean.valueOf(r1);
        //boolean =Boolean // unboxing
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("=======================");
        //============== max min ==================

        int maxNum=Integer. MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum=Integer. MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3=Byte.MAX_VALUE; //127
        System.out.println(maxNum3);

        byte minNum2=Byte.MIN_VALUE; //-128
        System.out.println(minNum2);

        System.out.println("================");

        boolean[]arr=new boolean[3];
        System.out.println(Arrays.toString(arr));

        Integer[]arr2=new Integer[3];
        System.out.println(Arrays.toString(arr2));





    }
}
