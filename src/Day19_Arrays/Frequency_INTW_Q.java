package Day19_Arrays;

public class Frequency_INTW_Q {
    public static void main(String[] args) {
       /* 2. write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"
        Hint: You need nested loops  */
       //IMPORTANT==> nonDuplicated="ABC"  str="AABCC";  ==>result="A2B1C2"

        String str="AABCC"; //"A2B1C2"
        String result="";  //"A2B1C2"
       String nonDuplicated=" "; //  ABC

        for(int i=0; i<=str.length()-1; i++) {
            if (!nonDuplicated.contains(""+ str.charAt(i))) {//if the character at index i is not contained in nonDup, then it will be.
                nonDuplicated += str.charAt(i);
            }

        }
        System.out.println(nonDuplicated);
        //IMPORTANT==> nonDuplicated="ABC"  str="AABCC";  ==>result="A2B1C2"
        int count=0; //count the total number of occurence of each char.from str
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='A'){
                count++;

            }
        }
          result+=""+'A'+count; //
        System.out.println(result+" ");

    }
}
