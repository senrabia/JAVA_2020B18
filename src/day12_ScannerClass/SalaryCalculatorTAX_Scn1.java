package day12_ScannerClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculatorTAX_Scn1 {
    /*Scanner methods:
    nextByte():returns the input as byte primitive
    nextSgort():returns the input as short primitive
    NextInt():returns the input as int primitive
    nextLong():returns the input as long primitive
    nextFloat():returns the input as  primitive
    nextBoolean();returns the input as  primitive
    next():
    Write a program can calculate the salary after tax
    ==>NEEDED information: employee' salary
          employee salary
          state tax
          federal tax
          MUST USE Scanner
 ==>import PackageName.ClassName
 ==>Import.java.util.Scanner;
 ==>VERIABLE NAME =>input*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary=input.nextInt();

        System.out.println("Enter the state tax:");
        byte stateTax=input.nextByte();
        double stateTaxPercentage=stateTax/100.0;

        System.out.println("Enter ithe federal tax:");
        byte federalTax=input.nextByte();
        double federalTaxPercentage=federalTax/100.0;//10/3.0==>3.3333

        //FORMULA==>total tax =>totalTax(federalTaxPercentage+stateTaxPercentagge)*salary
        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;

        //FORMULA==>salaryAfterTax=salary-totalTax
        double salaryAfterTax=salary-totalTax;
        System.out.println("Your salary after tax: $"+salaryAfterTax);
        System.out.println("Total tax: $"+totalTax);


        }
    }










