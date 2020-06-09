package Day25_MethodsRecap;

import Resources.Library2;

public class Class07_Methods_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="AABBCC"; //A2B2C2
        String NonDup= Library2.RemoveDuplicates(str);//ABC //System.out.println(NonDup);
        String result="";
        for( int i=0; i<NonDup.length(); i++){
        String ch=""+NonDup.charAt(i); //2 give me C2
        int num= Library2.Frequency(str,ch);
         result+=ch+num;                               //System.out.println(ch+num);  //C2
        }
        System.out.println(result);}

       public static String FrequencyOfChars(String str) {
           String NonDup= Library2.RemoveDuplicates(str);
           String result="";
           for( int i=0; i<NonDup.length(); i++){
               String ch=""+NonDup.charAt(i);
               int num= Library2.Frequency(str,ch);
               result+=ch+num;
       }
           return result;}


}

        // The letters from expected result is abc which is str with removed duplicates
        // We can call the method we created to remove duplicates

       //    System.out.println(NonDup);     //  abc

    // Now we want to know how many times the first character of NonDup had occurd in str
    //  char ch = NonDup.charAt(0); // a I want to know how many times this char a occured in str
    // is there anyway to convert this char ch to a string to check how many times it occured in str
    // String ch= "" +NonDup.charAt(0);
    //  Library.Frequency(str, ch); // This will tell me how many times ch = a occured in str = aabbcc

    //   int num = Library.Frequency(str, ch);
    //  System.out.println(ch +num); // a2

    // we need ot create a loop that will execute as many times as the length of NonDup
    // and we copy top steps to it

