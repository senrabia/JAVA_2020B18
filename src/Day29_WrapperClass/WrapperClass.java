package Day29_WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        /*        /*Data Structure:
    1. Array
    2. Collections ==> only accepts objects
    3. Maps ==>  only accepts objects
    primitives: byte, short, int, long, float, double, char, boolean
wrapper classes: classes that are dedicated to primitives

        Byte, Short, Integer, Long, Float, Double, Character, Boolean
        presented in "java.lang" package
    AutoBoxing: converting primitive values to wrapper class
                    int a = 100;
                    Integer b = a  // auto boxing
    unboxing: converting wrapper class value to primitives
                Integer a = 100;
                int b = a;  // unboxing
    int a = 100;
    double b = a;    // none
    methods:
        parse methods: converts string of text to the primitives
                    "123"
        valueOf methods:
*/



        int a=100;    //primitive

        Integer b=a;  //wrapper class

        short s1=200;
        int n1 = s1;

       // Integer N1=s1; // Eror //Intiger is dedicated to int primitives
        Integer n2=n1;
     //======================================
        int a1=20;
        float f1=a1;
    //  Float f2=a1;  //Eror

        Integer I1=200;
        int a2=I1;

        Byte B1=126;
        int a3=B1;
        System.out.println(a3);





    }
}
