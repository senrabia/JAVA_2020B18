package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray__1 {
    public static void main(String[] args) {
        int a = 100;
        int[] arr = {100, 200, 300};
        System.out.println((arr[1]));   //it give me 200

        for (int i = 0; i < 3; i++) {       //i: index num of elements
            // System.out.println(i);       //it give me index num.
            int num = arr[i];
            System.out.println(num);
        }  //  100   200   300
        System.out.println("====================================");

        int j = 0;
        while (j < 3) {
            int num = arr[j];
            j++;
            System.out.println(num);
        }    //100   200   300

        System.out.println("======================================");

        String[] names = {"Jhon", "Aaron", "Luoise", "Muhtar"};
        int length = names.length;
        String[] namesRev = new String[length];

         /* int k=length-1;
          for(int i=0; i<length; i++){
              namesRev[i]=names[k];
              k--;
              System.out.println(i);  // length 0 1 2 3  */
//  REVERSE  =============================================
        int i = 0;
        int k=length-1;  //max index number
        while(i<length){
            namesRev[i]=names[k];
            i++;
            k--;
        }

        System.out.println(Arrays.toString(namesRev));
        System.out.println(" ");
    }
}






