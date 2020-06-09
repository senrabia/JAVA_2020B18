package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoweAll {
    public static void main(String[] args) {

        /*Write program that can remove duplicates from an arraylist

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 1, 2, 1, 1, 1, 3, 4, 5, 6, 7, 8, 2, 3, 3, 3, 3, 3, 3));
     /*   //remove 1,2,3,4
        Integer a=1;
        list.remove(a);
        list.remove(a);
        Integer b=3;
        list.remove(b);
        list.remove(b);
         System.out.println(list);   */
        //==========  Easy remove Bulkoperation =============
        list.removeAll(Arrays.asList(3, 1, 5));
        System.out.println(list);
        //============ Easy remove second ===============
        Integer[] arr = {3, 1, 5, 8};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);

        //================= INTERWIEV QUESTION ==========
        String[] names = {"Ahmed", "Jhon", "Ahmet", "Ahmet", "Aeron", "Daniel"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        nameList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(nameList);


}
}
