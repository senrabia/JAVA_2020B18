package Day9_Nested_If_Ternary;

import java.util.Scanner;

public class Loan_Nested_If {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double salary = 120000;
        byte workHistory = 1;

        if (salary >= 30000) {//might be qualified
            if (workHistory >= 2) {
                System.out.println("You are Qualified for loan");
            } else  {
                System.out.println("You must have been on job at least 2 years");

            }
        }
         else {System.out.println("You must earn at least $3000");}

        }
    }


