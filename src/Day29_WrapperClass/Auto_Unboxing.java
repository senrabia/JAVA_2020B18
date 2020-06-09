package Day29_WrapperClass;

public class Auto_Unboxing {
    public static void main(String[] args) {
        /*1. Array
    2. Collections ==> only accepts objects
    3. Maps ==>  only accepts objects
    primitives: byte, short, int, long, float, double, char, boolean
wrapper classes: classes that are dedicated to primitives


         */

        int a=100;   //primitive
        Integer b=a;  //Autoboxing

        Byte byte1=98;

        short short1=byte1; //unboxing
        byte b2=byte1;     //unboxing
        int int1=byte1;    //unboxing


    }
}
