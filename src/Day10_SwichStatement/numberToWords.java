package Day10_SwichStatement;

public class numberToWords {
    /*write a java program that can convert numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid".
    DO NOT USE IF STATEMENTS ==> you can use ternary*/
    public static void main(String[] args) {
        //0~9
        int num = 9;
        String word = (num == 0) ? "zero" : (num == 1) ? "one" : (num == 2) ? "two" : (num == 3) ? "Three"
                : (num == 4) ? "four" : (num == 5) ? "five" : (num == 6) ? "six" : (num == 7) ? "seven"
                : (num == 8) ? "eight" : (num == 9) ? "nine" : "Invalid";
        System.out.println(word);



    }



}


