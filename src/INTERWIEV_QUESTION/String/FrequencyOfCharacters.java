package INTERWIEV_QUESTION.String;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {


   /* Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    */
//  1 ===============================================

  /* public static String FrequencyOfChars (String str) {
      String nonDup = "";

      for (int i = 0; i < str.length(); i++)
         if (!nonDup.contains("" + str.charAt(i))) {
            nonDup += "" + str.charAt(i);

            String expectResult = "";

            for (int j = 0; j < nonDup.length(); j++) {
               int count = 0;
               if (str.charAt(i) == nonDup.charAt(j))
                  count++;
               expectResult += nonDup.charAt(j) + "" +
                       count++;

            }
            return expectResult;
         }
    //  2   ===================================================
      public  static  String  FrequencyOfChars(String str) {
            String expectedResult = "";

            int j=0;
            while( j < str.length()) {
               int count = 0;

            for(int i=0; i < str.length(); i++) {
               if(str.charAt(i) == str.charAt(j)) {
                  count++;
               } }
            expectedResult +=str.charAt(j)+"" + count;
            str = str.replace(""+str.charAt(j) ,  "" );

         }return expectedResult;}

    //  3   =====================================================


      public  static  String  FrequencyOfChars(String str) {

         String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

         b = b.replace(", ","").replace("[","").replace("]","");

         String result="";

         for(int j=0; j<b.length();j++) {
            int count=0;
            for(int i=0; i<str.length(); i++)
               if(str.substring(i, i+1).equals(""+str.charAt(j)))
                  times++;
               result+=b.substring(j, j+1)+count;
         }
         return result;
         }
//   4   ==========================================================


    public static String  frequency(String str){
            String nonDup="", result="";

            for(int i=0; i<str.length(); i++)
               if(!nonDup.contains(""+str.charAt(i)))
                  nonDup+=""+str.charAt(i);

               for(int i=0; i<nonDup.length(); i++){
                  int num= Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));
                  result+=""+nonDup.charAt(i)+num;}
               return result;
               }
               */
      }



