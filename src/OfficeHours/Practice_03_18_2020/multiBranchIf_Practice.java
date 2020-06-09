package OfficeHours.Practice_03_18_2020;

public class multiBranchIf_Practice {
    /*multi-branch if statement:2+options, or conditions
    isf (condition1){
    A;
    }elseif(condition2){
    B;
    }elseif(condition3){
    C;
    }else{
    D;}
    only one of the gets executed
    A:if condition1 is true
    B:if condition 1 is false, and condition 2 is true
    C: if both condition1&2 false , and condition3 is true
    D: if condition 1,2,  and 3 are false
     */
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("It's is positive number");
        } else if (number < 0) {
            System.out.println("It's negative number");
        } else {
            System.out.println("It's zero");
        }
        //====================================================
        int num1 = 100;
        int num2 = 200;
        if (num1 > num2) {
            System.out.println(num2 + " is grater than" + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + "is grater than" + num1);
        } else {  //num1==num2
            System.out.println(num1 + "is equal to" + num2);
        }
        System.out.println("=====================================");

        String browserName = "Chome";

        if (browserName == "Firefox") {
            System.out.println("Firefox browser is opening");
        } else if (browserName == "chrome") {
            System.out.println("Chrome browser is opening");

        }else if(browserName=="Internet Explorer"){
                 System.out.println("Internet Explorer is opening");
        }else if(browserName=="Safari"){
            System.out.println("Safari browser is opening");
        }else if(browserName=="Opera"){
            System.out.println("Opera browser is opening");}
        else{
            System.out.println("Invalid Browser Name");}


             }
        }





















