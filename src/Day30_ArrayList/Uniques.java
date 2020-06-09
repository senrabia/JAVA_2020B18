package Day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /* 3. write a program that can print out the unique elements from an int array
      HINT: store all the unqie elemenbts of array into a list of integers
      Ex: array==> {1,1,2,3,3,4,5}
      output: {2,4,5} */
    public static void main(String[] args) {

        //==============  ArrayList Unique ===========

       ArrayList<Integer> list =new ArrayList<>();  //{1,2,1,}
             list.add(1);
             list.add(2);
             list.add(1);
           // list.get(0)==>1    //You can used for EACH LOOP
             int count=0;

             for(Integer each: list){
              if(each==list.get(0)){
                  count++;
              }}
           System.out.println(count);
            }
    }
//=====================================================
/*
       ArrayList<Integer> list = new ArrayList<>();  //{1,2,1,}

        list.add(1);
        list.add(2);
        list.add(1);
        // list.get(0)==>1    //You can used for EACH LOOP

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

        int count = 0;
        for (Integer each : list) {
            if (each == list.get(i)) {  //i yerine sifir gelebilir
                count++;
            }
        }
        if (count == 1) {
            uniques.add(list.get(i));  //i yerine sifir gelebilir
        }}
        System.out.println(uniques);
        System.out.println(list);
    }
                                                             */
//=========================================================
/*
       ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> uniques = new ArrayList<>();

        for(Integer each2 : list){
            int count = 0;
            for(Integer each  : list ){
                if(each == each2 ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1) {
                uniques.add(each2); // 0 1 2
            }}
                System.out.println(list);
                System.out.println(uniques);
    }}

*/








