package OfficeHours.Practice_03_18_2020;

public class NestedIf_Practice2 {
    /*for the==> LOAN
    for the loan:
   - if he/she has a job that pays>50000$==>might be eligible
    -if he/ she has good credit
    -if job history is ;more tha n or equal to 2==>then eligible

     */
    public static void main(String[] args) {
        int salary = 450000;
        short creditScore = 750;
        byte jobHistory = 1;

        if (salary > 50000) {//might be eligible
            if (creditScore > 650) {//might be eligible
                if (jobHistory >= 2) {//eligible for loan
                    System.out.println("You are qualified");
                } else {//not eligible due to credit score
                    System.out.println("You do not have good credit score");
                }
            } else {//not eligible due to credit score
                System.out.println("You do not have a good credit score");
            }

        } else{
                System.out.println("You need have a 'job that pays $50000");
            }


        }
    }

