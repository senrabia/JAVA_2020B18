package INTERWIEV_QUESTION.String;

import java.util.Arrays;
import java.util.Collections;

public class Find_Unique {
    /*Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
  */
 //   public static void main(String[] args) {

    public static String unique(String str){
        String[]arr=str.split("");
        String unique1="";

        for(int i=0; i<arr.length; i++){
            int num=0;

            for(int j=0; j<arr.length; i++){
                if(arr[j].equals(arr[j]))
                    num++;}
            if(num==1)
                unique1+=arr[i];
        }
        return unique1;
    }
    //     2  ====================================
      public static String Unique(String str){
        String result="";

        for(String each: str.split(""))
            result+=((Collections.frequency(Arrays.asList(str.split("")),each))==1)?each:"";
        return result;}




    }


