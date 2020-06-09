package Day30_ArrayList;

import java.util.ArrayList;

public class RemoweMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(7);
        list3.add(9);

        Integer a=2;
        list3.remove(a);
        System.out.println(list3);//Listedeki sayilari verir 1,7,9
        //Because Remove 2
        System.out.println(list3.remove(1));//Indexteki sayiyiverir// 2





    }
}
