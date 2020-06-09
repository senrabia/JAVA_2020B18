package Day32_Predicade;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {


    public static void main(String[] args) {
 //================  Question 5 =================
   ArrayList<String>names= new ArrayList<>();
   names.addAll(Arrays.asList("Robb","Bran","rick", "Bran"));

   if(names.remove("Bran")){ //{"Robb", "Rick", "Bran"}
       names.remove("jhon"); //{"Robb", "Rick", "Bran"}

   }
        System.out.println(names);
   //=================Qustion 9 =====================

        ArrayList<Integer>  numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.set(0, numbers.get(4)); // {5,2,3,4}
       // set (0,5)
       //{2,2,3,4,5}
        numbers.set(4,numbers.get(0));  //

        System.out.println(numbers);

   //================= Question 11 =================
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

           for(Integer each:nums){
               if(each%2 !=0 ) {
                   continue;
               }
               System.out.println(each); //2
               break;
           }
    }
}
