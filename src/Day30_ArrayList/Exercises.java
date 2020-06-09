package Day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {

        /*1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
	2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
	3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

         */
        //===========  reverse  ============
        int[]arry={1,2,3,4,5};
        for(int i=arry.length-1; i>=0; i--){
            int eachNum=arry[i];
            System.out.println(eachNum+"");

            System.out.println("");}

        //=========== unique ==============
        int[]arrM={1,1,2,3,3,4,5};

        for(int j=0; j < arrM.length; j++) {
            int count = 0;
            for (int each : arrM) {
                if (each == arrM[j]) {
                    count++;
                }}
            if(count == 1){
                System.out.print(arrM[j]+" ");
            }}
        System.out.println("");


        //===========  string  ==============
        String[]arr={"A","B","C"};
        String []arr1={"D","E","F","G"};
        String[][]arr2={ {"A","B","C"}, {"D","E","F","G"}};
        System.out.println(Arrays.deepToString(arr2));

       ArrayList<String>arrayList=new ArrayList<>();
        for(int k=0; k<arr2.length; k++) {


        String[] arr3 = {"A", "B", "C"};
        String[] arr5= {"D", "E", "F", "G"};
        for (String each : arr3) {
            arrayList.add(each);
        }
        for (String each : arr5) {
            arrayList.add(each);
        }
        System.out.println("{ "+arrayList+" }");

        }       }}





