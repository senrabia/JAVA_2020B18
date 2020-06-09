package Day14_StringClass2;

import java.util.Scanner;

public class CombainTwoString {
    public static void main(String[] args) {
        /*1. Ask user to enter two words. Print the first word, second word, second word, first word
        Input:
        one
        two
        Output:
        onetwotwoone
        DO NOT USE + OPERATOR*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=input.next();
        System.out.println("Enter second word");
        String word2=input.next();

        String result=word1.concat(word2).concat(""+word2).concat(word1);

        System.out.println(result);





    }
}
