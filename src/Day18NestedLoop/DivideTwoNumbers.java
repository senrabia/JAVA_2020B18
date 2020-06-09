package Day18NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*1. write a program that can divide two numbers.
        NOTE: DO NOT USE division, multiplication, or module operators
        10/3==> 3 with a reminder of 1   =>10=3-3-3=>1
         a=a-b=7;
         a=a-b=4;
         a=a-b=1;  ==>COUNT=3; a=1;       */

        int a=20;      //numator
        int b=3;       //denumarator
        //int count=0; //count the execution of the loop.
        if(b==0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }
        int count=0;  //count the execution of the loop.
        while(a>=b){
            a-=b;
            count++;}
        //System.out.println(count);
       // System.out.println(a);
        if(a==0){
        System.out.println("The result is "+count);}
        else{
            System.out.println("The result is "+count+" with a reminder of "+a);}


        }

    }

