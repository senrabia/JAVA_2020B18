package Day32_Predicade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        Predicate<Integer>  oddNumber = x -> x %2 !=0;

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("============================");

        Predicate<Integer>lessThan5= Y -> Y < 5;

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("===========================");
     //========= ArrayListOfString ======================
       Predicate<String> startsWithM= s-> s.startsWith("M");

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza","Muhammed","Boris","Sha","bilal"));
        System.out.println(names);

        names.removeIf(startsWithM);
        System.out.println(names);
        System.out.println("===============================");

 //=========== Name  List=====================================
//if the name starts with M or A , remove the name from the list
       Predicate<String>startsWithMorA= each->each.startsWith("M")||each.startsWith("A");

       ArrayList<String> namesList= new ArrayList<>();
       namesList.addAll(Arrays.asList("Muhtar","Alex","Asiya","Sha","Radu"));

        namesList.removeIf(startsWithMorA);
        System.out.println(namesList);
        System.out.println("====================================");
        Predicate<Character>digits=c-> Character.isDigit(c);      //c->c >= 48 && c<=57;

        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','C','3','@','z','&'));
        chars.removeIf(digits);

        System.out.println(chars);
        System.out.println("==================================");

        Predicate<Integer> graterThan5= y-> y> 5;

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf(y-> y>5);
        System.out.println(nums);


    }
}

















