package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        // add 30,20,40,50,45,35,200
     /* list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(45);
        list1.add(35);
        list1.add(200);*/

     //list1.addAll(Arrays.asList(30,20,40,50,45,35,200)); // 2 ci yol
     //   int[]arr1={30,20,40,50,45,35,200};
        Integer[]arr1={30,20,40,50,45,35,200};

        list1.addAll(Arrays.asList(arr1));
        //list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
        System.out.println(list1);
        System.out.println("========================");
        String[] names={"Murtaza","Muhtar","Muhesong","Sada","Rustem"};
       // names[5]="Osman";  //aut of band
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
                       //collectionType
   //============convert arr to arrList  (add ===  remove)  ==

        nameList.add("osman");
        nameList.remove("osman");//not remove because lowercase
        nameList.remove("Muhtar");
        System.out.println(nameList);
        System.out.println("=============================");
    //================= short hand add ===================
        Integer[]numbers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>numList=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);





    }
}
