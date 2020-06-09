package Day32_Predicade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod_INWQ {
        /*Write program that can return the second maximum number from ArrayList
          Ex:{1,2,3,4,5,6,7,8,8}
          Write program that can return the second minimum number from ArrayList
          Ex:{1,1,2,3,4,5,6,7,8,8}
         */
//NOT==> THAT PROGRAM IS WORKING ALL TO GETHER V
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));
//================= MAX AND MIN  ======================
            int max = Collections.max(list);
            System.out.println(max);

            int min = Collections.min(list);
            System.out.println(min);
//================  Find Max Num == Remove SecondMax Number ===

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));

            Integer maxNum = Collections.max(numbers);
            numbers.removeAll(Arrays.asList(maxNum));
            System.out.println(numbers);
            //=====
            int secondMax = Collections.max(numbers);
            System.out.println(secondMax);

            System.out.println("===============================");
        //=========Find Min Num == Remove SecondMin Number =========
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));
            Integer minNum = Collections.min(list2);   //min number  1
            System.out.println(list2);  //Whole list give me.

            list2.removeAll(Arrays.asList(minNum));   //removes all the minimum number
            System.out.println(list2);
            System.out.println("===============================");
       //============   Swap the List =========================
            ArrayList<Integer> list3=new ArrayList<>();
            list3.addAll(Arrays.asList(1,2,3,4,5));
            System.out.println(list3);

            Collections.swap(list3,0,4);
            System.out.println(list3);
            System.out.println("================================");
       //===============   Replace All ==========================
            ArrayList<String> names = new ArrayList<>();
            names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));  // Irina

                      /*
                        names.set(0, "Irina");
                        names.set(1, "Irina");
                        names.set(5, "Irina");
                        */
                    Collections.replaceAll(names, "Omer", "Irina" );
                    System.out.println(names);





        }}























