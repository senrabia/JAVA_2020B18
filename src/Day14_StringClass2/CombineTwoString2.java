package Day14_StringClass2;

import java.util.Scanner;

public class CombineTwoString2 {
    /*2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
    Input:
    apple
    banana
    Output:
    ppleanana */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       String a1="apple";
        a1=a1.substring(1,5);
        String a2="banana";
        a2=a2.substring(1,6);
        System.out.println(a1+""+a2);
 //=====================================
        System.out.println("Enter first word");
        String word1=input.next();//Apple
               word1=word1.substring(1,word1.length());
        System.out.println();

        System.out.println("Enter first word");
        String word2=input.next();//Banana
        word2=word2.substring(1,word2.length());//anana
        String result=word1+word2;

        System.out.println(result);





    }

}
