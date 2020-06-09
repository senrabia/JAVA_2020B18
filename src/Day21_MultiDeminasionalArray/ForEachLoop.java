package Day21_MultiDeminasionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*for each loop: loop that's already been iterated

        for(DataType variableName : ArrayName ){}

        variable name represents each of the data in the array
        DataType MUST be matched with Array's data type
        number of execution times of the loop depends on teh size of the Array
        iteration is always started from index 0 of the Array

        When do we use it:  first we MUST have a data structure
                            whenver we dont need to proide the index numbers

         */

        int[] nums={1,2,3,4};
        for(int eachElement:nums){
            System.out.println(eachElement);}
        //=====================================
        String[] students={"Muhtar","Asiya","Murodil"};
        for(String eachStudent:students)
            {System.out.println(eachStudent);}
        //ARRAY=================================

        int[]arr1={10,2,3,4,5,6,7,8,9,1};
        Arrays.sort(arr1);


        for(int each: arr1)
        {if(each<5) {continue;}

        System.out.println(each);}

        System.out.println("====================");

        String sentence="I like Java";           //java like I
        String[]words=sentence.split(" ");//[I like java]
        for(String eachWord:words){//0~2
            System.out.println(eachWord);}
        System.out.println("====================");

        for(int i=words.length-1; i>=0; i--){
            System.out.println(words);

        }


    }
}
