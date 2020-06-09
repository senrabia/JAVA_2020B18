package Day32_Predicade;

import KizlarCaySaati.Unique;
import PracticePractice.Note.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class NightTime_Exercises {
    public static void main(String[] args) {
  /*1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList

   */
       //================ missing 1 1 ====================
        Predicate<Integer> frequency= eachMore-> eachMore<=1;
        ArrayList<Integer> uniqueNumber= new ArrayList<>();
        uniqueNumber.addAll(Arrays.asList(1,1,2,3,4,5,5));
        uniqueNumber.removeIf(eachMore-> eachMore<=1);
        System.out.println(uniqueNumber);
       //================ missing 1 1  5 5 ===============
        ArrayList<Integer>  list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> frequency1 = each-> Collections.frequency(list,each)>1;
        list.removeIf(frequency1);
        System.out.println(list);
       //=============== missing  2 3 4  ==================
        ArrayList<Integer>  list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> frequency3 = each-> Collections.frequency(list3,each)==1;
        list3.removeIf(frequency3);
        System.out.println(list3);

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
        ArrayList<String> str1=new ArrayList<>();

        ArrayList<String> specials= new ArrayList<>();
        Predicate<String> herBir=  each-> Collections.frequency(specials,each)==1;
        specials.addAll(Arrays.asList("A B C D 1 2 3 $ % # @ & 4 5 6 E F G ! "));
        System.out.println(specials);





    }
}
