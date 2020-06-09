package Day16_Loop;

public class DublicateRemove_abc {
    /*
    * Write a Java program that can remove duplicated values from String
    * EX: input:aabbcc
    *    output:abc        */
    public static void main(String[] args) {
        String s1="aabbcc";
        String result=" ";   //  abc

        for(int i=0;  i<s1.length();  i++){
           if(!result.contains(s1.substring(i, i+1))){
               // if we used charAt method (""+s1.charAt(i)) is that working.
              result +=s1.substring(i, i+1);}

           }
            System.out.println(result);

        }
    }





