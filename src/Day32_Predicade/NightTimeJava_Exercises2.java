package Day32_Predicade;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class NightTimeJava_Exercises2 {
    public static void main(String[] args) {
        /*	1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
				*/

        System.out.println("================================");
        ArrayList<String> str1 = new ArrayList<>();
//================  All  List ======================================
        ArrayList<String> specials = new ArrayList<>();
        Predicate<String> herBir = each -> Collections.frequency(specials, each) == 1;
        specials.addAll(Arrays.asList("A B C D 1 2 3 $ % # @ & 4 5 6 E F G ! "));
        System.out.println(specials);

//================   Find Char Num Digit                    =============================
     /*   String str="A B C D 1 2 3 $ % # @ & 4 5 6 E F G ! ";
        ArrayList<Character> listOfdigits = new ArrayList<>();
        ArrayList<Character> listOfLetters = new ArrayList<>();
        ArrayList<Character> listOfSpecials = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                listOfdigits.add(str.charAt(i)); }
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                listOfSpecials.add(str.charAt(i)); }
            if (Character.isLetter(str.charAt(i))) {
                listOfLetters.add(str.charAt(i)); } }
        System.out.println(listOfSpecials);
        System.out.println(listOfLetters);
        System.out.println(listOfdigits);             */

        String str3="A B C D 1 2 3 $ % # @ & 4 5 6 E F G ! ";
        char[]ch=str3.toCharArray();

        ArrayList<Character> list1= new ArrayList<>();
         for(char each:ch)
        { list1.add(each);}

        ArrayList<Character> list2 = new ArrayList<>();
        for(char each:ch)
        { list2.add(each);}

        ArrayList<Character> list3= new ArrayList<>();
        for(char each:ch)
        { list3.add(each);}

        list1.removeIf(each->Character.isDigit(each)||Character.isAlphabetic(each));
        System.out.println(list1);
        list2.removeIf(each->!Character.isAlphabetic(each));
        System.out.println(list2);
        list3.removeIf(each->!Character.isDigit(each));
        System.out.println(list3);



        }



    }






