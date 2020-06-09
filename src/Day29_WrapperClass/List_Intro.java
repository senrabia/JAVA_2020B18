package Day29_WrapperClass;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        /*  ArrayList:part of Collection
        does not support primitives, only support non primitives.
        int[]arr={1,2,3,4,5}
         */
     //ArrayLIst <DataType> listName= newArrayList <DataType>();


        ArrayList<Integer> scores=new ArrayList<>();
                            //add five elemts, size :5
                            // remove two elements, size:3

        scores.add(10);     //Autoboxing size:1
        scores.add(20);     //Autoboxing size:2
        scores.add(30);     //size:3
        System.out.println(scores);

        scores.get(2);

    }

}
