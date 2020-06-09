package OfficeHours.Practice_04_29_2020;

import com.sun.jdi.IntegerType;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class ArrayList_Methods {
    /*ArrayList: does not support primitive
     - size is dinamik, size is auto_adjusted
     Has Index number
    add(), get(), size(), set(), remowe(0, clear(), index(),lastIndexOf()

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // System.out.println(list);//[]
        // System.out.println(list.size());//0

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 30);  //adds the element at the given index.
        //      {10, 30, 20}

        System.out.println(list);
        System.out.println(list.size());
        //list.get(2);
        int num1 = list.get(02);//Integer 20, unboxing

        byte a = 100;
        // Integer b=a;

        Byte a2 = 100;
        int b2 = a2;  //unboxing
//===============  string  ====================
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add(2, "E");
        System.out.println(list2);

        //======================================

        for (int i = 0; i <= list2.size(); i++) { //i: 0,1,2,3,4
            String str = list2.get(i);
            System.out.println(str);
        }

        System.out.println("===================");
//==============  for each loop =========,

        for (String each : list2){

            System.out.println(each);
        } //each elemet

        //list2: {A,B,E,C,D}; , replace C with F
        //
        list2.set(3, "F"); // {A,B,E,F,D};
        System.out.println(list2);
//=================  remove =============
        list2.remove(3);
        System.out.println(list2);

       // list2: {A,B,D,E}

        boolean ra=list2.remove("A");
        System.out.println(list2);
        System.out.println(ra);

        boolean rb=list2.remove("B");
        System.out.println(list2);
        System.out.println(rb);
//==============   clear  ============
        list2.clear(); //size:0
        System.out.println();
        System.out.println();


    }
}