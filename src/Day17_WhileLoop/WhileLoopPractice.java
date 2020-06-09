package Day17_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*ask the user to enter yes or no;
        if theuser enter s other than yes or no, repeat the previous step
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("Yes") || !word.equalsIgnoreCase("No");

       while (!valid){
           System.out.println("please re-enter");
           word=input.next();
           if(word.equalsIgnoreCase("Yes") || !word.equalsIgnoreCase("No"));
           break;

       }
        if (word.equalsIgnoreCase("Yes")) {
            System.out.println("Enter no");
        }
        if (word.equalsIgnoreCase("no")) {
            System.out.println("Enter Yes");
        }
        System.out.println("=========================================================");






    }
}