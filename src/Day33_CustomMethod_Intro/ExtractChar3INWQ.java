package Day33_CustomMethod_Intro;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChar3INWQ {
    public static void main (String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        Character[] ch = new Character[arr.length];
        for (int i = 0; i < arr.length; i++)
            ch[i] = arr[i];

   // System.out.println(Arrays.toString(ch));  //Eror

    ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
    letters.removeIf(p->!Character.isLetter(p));
    System.out.println(letters);



    ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
    digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);

    ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
     specialChars.removeAll(letters);
     specialChars.removeAll(digits);
     specialChars.removeIf(p->Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialChars);
}
}