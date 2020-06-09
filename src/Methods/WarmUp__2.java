package Day24_Methods.Methods;
import java.util.Scanner;


    /*      1. write a methods that can return the maximum number between two numbers
    Ex: Max(10, 20) ==> 20
            2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    Ex: calculate(10, 2, '*') ==> 20;
    calculate(10, 2, '&') ==> Invalid operator
    NOTE: The method MUST take three arguments when it's called
            3. write a method that can identify if a string is palindrome
    ex: palindrom("level")  ==> true
    palindrome("Cybertek") ==> false*/

  //  TASK 1 ======================================
    public class WarmUp__2 {

    public static void Max(int num1, int num2) { }//.....}
       /* if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else {
            System.out.println("Maximum number is: " + num2);*/
       public static void palindrome(String str) {
           str=str.toLowerCase();
           String reversed="";
           for(int i=str.length()-1; i>=0; i++){
               reversed+=str.charAt(i);
           }

       }
       public static void Calculation(double num1,double num2,char operator){
           switch(operator){ case'+':
               System.out.println(num1+num2);
               break; case'-':
                   System.out.println(num1+num2);
                   break; case'*':
                       System.out.println(num1+num2);
                       break;case'/':
                           System.out.println(num1+num2);
               break;case'%':
                   System.out.println(num1+num2);
                   break;
               default:   System.out.println("invalid");

        }
    }

    public static void main(String[] args) {
      int a=1000000;
      int b=200;
      Max(a,b);
        Calculation(10,20,'*');
        Calculation(30,40,'+');
        int n1=10000;
        int n2=100;
        Calculation(n1,n2,'/');

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=scan.nextInt();
        System.out.println("Enter num2: ");
        int num2=scan.nextInt();
        System.out.println("Enter operator: ");
        char operator=scan.next().charAt(0);
                Calculation(num1,num2,operator);
                System.out.println("Do wanna to continue? ");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("Yes"))||
                (answer.equalsIgnoreCase("No"))){
            System.out.println("Invalie enter, Please re-enter");
            System.out.println("Do you want to continue?");
        }
        if(answer.equalsIgnoreCase("No")){
           // break;
        }
       }

    public static void method(String name) {

    }

}








