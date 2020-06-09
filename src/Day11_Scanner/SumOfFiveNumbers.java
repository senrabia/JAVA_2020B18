package Day11_Scanner;

import java.util.Scanner;
/*write a program that asks enter 5 number and prints the number in
ascending order
Assignment:
Ex;  5,4,1,2,3
output:
     1,2,3,4,5
 */

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter five numbers");

        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double num4=input.nextDouble();
        double num5=input.nextDouble();

        double sum=0;
        if(num1>0) {
            sum+= num1;
        } if(num2>0){
                sum+=num2;
        }if(num3>0){
            sum+=num3;}
        if(num4>0){
            sum+=num4;}
        if(num5>0){
            sum+=num5; }
        System.out.println("Sum of positive numbers are: "+sum);







    }
}
