package INTERWIEV_QUESTION.String;

public class SumOfDigits_String {
    /*
    Write a method that can return the sum of the digits in a string
    */


    public static int numOdDigits(String s){
        int total=0;
        char[]ch=s.toCharArray();

        for(char each:ch){
            if(Character.isDigit(each)){
                total+=Integer.valueOf(""+each);
            }
        }
        return total;

    }
}
