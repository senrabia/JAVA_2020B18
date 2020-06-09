package Day9_Nested_If_Ternary;

import java.sql.SQLOutput;

public class IfStatem_WithOutCurlyBraces {
    public static void main(String[] args) {
        //__THIS IS NOT A GOOD HABIT
        /*If statement without curly bracet:the block can only contain
        one statement.

     ==>int number=100;

  if (number %2==0) {System.out.println("Even number");}

   else {System.out.println("Odd number");}*/

        int number=100;

        if (number %2==0) System.out.println("Even number");

        else System.out.println("Odd number");
if(9>8)//if the block containg more than one statement we MUST
    // give the budy.
    System.out.println("Hello");
    System.out.println("Condition is true");
    System.out.println("Test executed");













    }
}
