package Day30_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
         /*1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)*/

      /*  String str = "a1b2c3";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        //lookat ascii table

        int sum = 0; //will contain some all digits.(Hane )
        for (char each : arr) {
            //boolean isDigit=each>=48 && each<=57;{
            //if(isDigit){
            sum += Integer.parseInt("" + each);  //"0"//IMPORTANT=> Converting int string.
        }
    }
    System.out.println(sum);
    boolean a=Character.isAlphabetic('A');  //isDigit():identifies if the character is alphabet
/*assignment task:
       extract the digits and letters from a string.
 */



}}




