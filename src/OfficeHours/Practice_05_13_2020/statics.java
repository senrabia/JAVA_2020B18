package OfficeHours.Practice_05_13_2020;

import org.w3c.dom.ls.LSOutput;

//--4
public class statics {
    int instanceVariable=100;
    static int staticVariable=200;

    public static void staticMethod(){
        // instanceMethod();
        // System.out.println( instanceVariable );
        System.out.println( staticVariable );
        System.out.println("====================");
    }


    public void instanceMethod(){
       staticMethod();
       System.out.println( staticVariable );
       System.out.println( instanceVariable );
    }


    public static void main(String[] args) {
        //  System.out.println( instanceVariable );
        System.out.println( staticVariable );
         staticMethod();
        //  instanceMethod();
    }}







