package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method2_Remove {
    public static void main(String[] args) {
        System.out.println("====================");
//=============== string remove  ===============
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

       // list.remove(1);
        String str="B";
        list.remove(str);
        boolean r1=list.remove("A");
        boolean r2=list.remove("L");

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("====================");
  //============= clear method =================

       list.clear();
        System.out.println(list);
        System.out.println(list.size());
 //===========
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

       int num1= list2.indexOf(1);   //0
        //Integer=int //Autoboxing
        System.out.println(num1);

        int num2=list2.indexOf(100);
        System.out.println(num2);

        int num3=list2.indexOf(3);
        System.out.println(num3);

    }
}
