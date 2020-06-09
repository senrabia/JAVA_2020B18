package Day21_MultiDeminasionalArray;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
      /*  String methods:
        toCharArray(): returns char array from string, returns char array
        split(Value): splits the string with given value, returns String array

        */

        String name="Java";  //'j','a','v','a'
        char[] chars=name.toCharArray();
        System.out.println(chars[0]); //'j'
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);

        String str="I like Java";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        /* reverse sentence: day great is today
          */
        String sentence="Today is great day";
        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));//[Today, is, great, day]
        String result="";
        for(int i=words.length-1; i>=0; i--){
           String eachWords=words[i];
           // System.out.println(eachWords+" ");
            result+=eachWords+" ";
        }
        System.out.println(result);

        String str2="ABCD";
        String arr2[]=str2.split("");
      //  char[]ch2=str.toString();

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr2));
       // System.out.println(Arrays.toString(ch2));






    }
}
