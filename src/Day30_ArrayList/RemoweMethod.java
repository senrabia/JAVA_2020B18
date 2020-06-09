package Day30_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class RemoweMethod {
    /*   remove (index): object at the given index will be remove
          remove(object):given object will be remove
     */

    public static void main(String[] args) {
        //============ index remove method ========
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        int a=2;       //3 is missing
        list3.remove(a);

        System.out.println(list3);
}   }
//================ integer  ================================
/*  ArrayList<Integer>list3=new ArrayList<>();
               list3.add(1);
                list3.add(2);
                list3.add(3);
                list3.add(4);

                Integer a=1;

                list3.remove(a);

                System.out.println(list3);
                }}}
 */

