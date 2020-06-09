package Day32_Predicade;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
    /*Collections: ->frequency
                   ->swap
                   ->sort
                   ogrendiklerimiz.

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0));
        System.out.println(list);
        //=========== COLLECTIONS METHOD ===============
        int count = Collections.frequency(list, 0);
        System.out.println(count);
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
//=============                   ================
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println(list);
//============ II merhod ==========================
 /*   int count=0;
    for(Integer each:list){
        if(each==0){
            count++;}}
    list.removeAll(Arrays.asList(0));
    for(int i=0; i<count; i++)

    {
        list.add(0);
    }
    System.out.println(list);    */
    }



}

