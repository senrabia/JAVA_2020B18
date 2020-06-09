package Day29_WrapperClass;

public class ParseMethods {
    public static void main(String[] args) {
        /*Data Structure:
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
        parse methods: converts string of text to the primitives,
         returns primitives values, not case sensitive
                    "123"
        valueOf methods:converting string to wrapper class value.
*/

        String str="123";  //"123abc" Eror

        int a1= Integer.parseInt(str);

        System.out.println(str+1); //text
        //                 "123"+1==>"1231"
        System.out.println(a1+1);  //number
        //                  123+1==>124

     //================ Byte=========
        byte b1=Byte.parseByte(str); //byte=123
        System.out.println(b1+5);    //

       // Integer I1=Byte.parseByte(str);  Eror
        Integer I1=(int) Byte.parseByte(str); //Autobox
        System.out.println(I1);
        System.out.println("=================");
    //=============== double      ===========

        String str2="10.5";
        float f1=Float.parseFloat(str2);  //float 12.5
        System.out.println(f1+1);          //13.5

        double f2=Double.parseDouble(str2); //double12.5
        System.out.println(f2+1);           //13.5

        String str3="3329654655";
        long num1= Long.parseLong(str3);//3329654655L
        System.out.println(num1+2);

        Long num2=Long.parseLong(str3); //autoboxing
        System.out.println(num2+2);
        /*BOOLEAN
         parse method boolean:any string other then "true"  will ALWAYS return false

         */

        String result1="true";//"Today is Monday";
        //  not "rtue" or not "false" ==>false
        boolean r1=Boolean.parseBoolean(result1);  //boolean
        System.out.println(r1);//  tersini verir (!r1)
        String result2="fALse";//"false"
        String result3="TrUE";//"true"


    }
}
