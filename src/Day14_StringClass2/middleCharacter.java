package Day14_StringClass2;

import java.util.Scanner;

public class middleCharacter {
    /*3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
        Input :
        elephant
        Output:
        The middle character in the string: ph
        String isEven="elephant";
           int  isEven= isEven.index(0);
        System.out.println(isEven);*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();   //bananas
        //0123456
        String middleCharacter = "";  //to store the middle characters at the end.

        int totalChar = word.length(); //5
        int middleNumber = totalChar / 2; //  7/2=3

        if (totalChar % 2 != 0) {   //odd number (FORMULA)
            // {middleCharacter+=word.charAt(middleNumber);}//Attaki ile same means.
            middleCharacter = middleCharacter + word.charAt(middleNumber);
        }else{// middleCharacter = middleCharacter + word.charAt(middleNumber-1)+word.charAt(middleNumber);
            middleCharacter += word.charAt(middleNumber-1)+""+word.charAt(middleNumber);
        } //any thing we added to a string will return it as string
        System.out.println("Middle character: "+middleCharacter);








    }
}
