package Day14_StringClass2;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
      /*  1. Write a program CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
                - if some same length and others not:    print "Not Same nor Different lengths"
                - if all different length :  print "All different length"*/
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=input.next();
        System.out.println("Enter second word");
        String word2=input.next();
        System.out.println("Enter third word");
        String word3=input.next();
        int length1=word1.length();
        int length2=word1.length();
        int length3=word1.length();
        boolean allNotSame=length1 !=length2 && length2!=length3&&length1!=length3;
        // non of them are same with each other
        if(length1 ==length2 && length2==length3){
            System.out.println("print all words are same length ");
       }else {
            System.out.println("All different length");}


    }
}
