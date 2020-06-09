package Day32_Predicade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Uniques {
    //Write program that can return the unique objjects from arraylist of characters

    public static void main(String[] args) {
        Character[] chars={'A','A','A','B','C','D','D','D','D'};

        ArrayList<Character> charList=new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result= new ArrayList<>();  //[B,C]

        for(int i=0; i<charList.size(); i++){
//=============== Unique Character ===============
        int count=Collections.frequency(charList, charList.get(i));
        if(count==1){
            result.add(charList.get(i));

        }}
        System.out.println(result);
//================  Eksik Olani Frequency ========
        for(Character each: charList ){ // each: A, A, B, C, D, D
            int count = Collections.frequency(charList, each);
            if(count == 1){
                result.add( each );
            }
        }
        System.out.println(result);


    }

}
