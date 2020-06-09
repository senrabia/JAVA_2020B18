package Day9_Nested_If_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
       /* char ch1='+';
        System.out.println(ch1);*/
        int num = 100;
        char ch1 = ' ';

        if (num > 0) {
            ch1 = '+';
        } else if (num < 0) {
            ch1 = '-';
        } else {
            ch1 = '0';
        }

        char ch2 = (num > 0) ? '+' : (num < 0) ? '-' : '0';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("==========================");

        byte score = 90;
        String grade = " ";
        if (score >= 90 && score <= 100) {
            grade = "Excellent";
        } else if (score >= 80 && score <= 90) {
            grade = "Great";
        } else if (score >= 70 && score <= 80) {
            grade = "Good";
        } else if (score >= 60 && score <= 70) {
            grade = "Pass";
        } else if (score >= 60 && score <= 0) {
            grade = "Failed";
        }else{//if the score ise less than 0 or grater than100
               grade="Invalid";}
        System.out.println("=============================");

       /* boolean num = 1000;
        if (num %2 = 0) { System.out.println("Even number");}
        else { System.out.println("Odd number");}*/
        }

    }































