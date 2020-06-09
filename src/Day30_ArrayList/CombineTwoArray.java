package Day30_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArray {
   /* 5. write a program that can combine two String arrays into one arrayList
    ex:
    arr1 = {"A", "B", "C"};
    arr2 = {"D", "E", "F", "G"};
    list ==> {"A", "B", "C", "D", "E", "F", "G"}*/
   public static void main(String[] args) {

       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};

       ArrayList<String> list = new ArrayList<>();
           for (int i = 0; i < arr1.length; i++) {
           String eachElement = arr1[i];
           list.add(eachElement);    //arr1[i]

          // System.out.println(list);
       }

       for (String eachElement : arr2) {
           list.add(eachElement);
       }
       System.out.println(list);
   }

   }


