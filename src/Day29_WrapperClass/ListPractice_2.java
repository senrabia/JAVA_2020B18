package Day29_WrapperClass;

import java.util.ArrayList;

public class ListPractice_2 {
    public static void main(String[] args) {
       /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        //
        //int maximum=Integer.MAX_VALUE;//
        int maximum = list.get(0);
        // int maximum=0;//if you want it can be used.
        for (int i = 0; i < list.size(); i++) {  //i:
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);

        //==============  minimum ================
        int minimum = list.get(0);

        for (int i = 0; i > list.size(); i++) {  //i:
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        System.out.println(minimum);
        //============= each max =============

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each > maximum2) {
                maximum2 = each;
            }
        }
        System.out.println(maximum2);



        ArrayList<Integer> list2 = new ArrayList<>();


        list2.add(5000);
        list2.add(200);
        list2.add(300);
        int result= max(list2);
        System.out.println(result);
    }
    public static int max (ArrayList <Integer> list ) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }}



