package Day30_ArrayList;

import PracticePractice.Note.Array;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*Methods: add(Object):adda objects to the arrray list
     add(index, Object); adds the onbject at the given index
             list==> {1,2,3};       list.add(1,2)
             list==>{1,2,3,4};
             list2==>{"A", "C", "D"}   "B"
               list2.add("B"); ==>{A,B,C,D}
     */
    public static void main(String[] args) {
//=============  add number  == yer==sayi=====
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); //0
        list1.add(7);
        list1.add(8);
        //list1.add(9);
        list1.add(1,6);   //1=>  {5,6,7,8,9}

        list1.set(3,9);
        System.out.println(list1);
  //=============== change ====================
        int []arr={1,2,3,4};
        arr[3]=5;
 //================  add char  ================
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A"); //0
        list2.add("B");
        list2.add(1,"C");//{A,B,C}
        list2.add(1,"D");//{A,B,C,D}

        list2.set(3,"F");
        list2.set(2,"E");
        System.out.println(list2);}}

