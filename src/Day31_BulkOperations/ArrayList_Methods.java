package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        /*1.Array==>Arrays(java.util)
          2.Collection==>Collections(java.util)
          3.Maps
     //======================
        Methods:
        contais(Object):return boolean
        .equals (ArrayListName):compares two arraylist
        isEmpty():size==>0=>true
        otherwise false
       //=====================
        Bulk Operations:
        contaiAll(CollectionType):verifies
        addAll(CollectionType):
        remoweAll(CollectionType):
        retaInAll(CollectionType):
        //=======================
        Arrays.asList(object1, object2,......)
        //=======================
        sorting arrayList:
        Colections.sort(ArrayListName);==>Ascending order
        Collection: presented in "java.util"

         */

        ArrayList<String>list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        boolean r1=list1.contains("C");
        System.out.println(r1);

        ArrayList<String>list2=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        Collections.sort(list1);//call true the class
        Collections.sort(list2);

        boolean r2=list1.equals(list2);
        System.out.println(r2);

        //Arrays.equal(arr1,arr2)
        int[]arr1={1,2,3};
        int[]arr2={3,2,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r3=Arrays.equals(arr1,arr2);
        System.out.println(r3);
        System.out.println("===================");
//====  print each order decending order ======
        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        //expected:1000 100 20  10
        Collections.sort(list3);
        System.out.println(list3);
 //==================Reversed ==================
        ArrayList<Integer>reversedList3=new ArrayList<>();
        for(int i=list3.size()-1; i>=0; i--){
            reversedList3.add(list3.get(i));}

            System.out.println(reversedList3);
            System.out.println(list3);
            System.out.println(list3.size());
            list3.clear();
            boolean r4=list3.isEmpty();
            System.out.println(r4);

            //====== for loop ===DECENDING ORDER ============
      /*  for(int i=list3.size()-1; i>=0; i--){
            System.out.println(list3.get(i));}*/


    }
}
