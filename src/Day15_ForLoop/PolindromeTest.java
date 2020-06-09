package Day15_ForLoop;

import java.util.Scanner;

public class PolindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine(); //Java
        //0123
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) ;
        {
            // INCELE-->>    reversedWord += word.charAt(i);}
            // System.out.println(reversedWord);
            boolean palindrome = word.equalsIgnoreCase(reversedWord);//FALS-TRUE isteniyorsa
            System.out.println(palindrome);//IGNORECASE METHOD boolean in yanina Ignorecase eklen
        }
    }
}





