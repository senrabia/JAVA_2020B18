package Day9_Nested_If_Ternary;

import org.w3c.dom.ls.LSOutput;

public class Nested_If_Statement {
    //if the condition evaluate to multiple scenario if we have precondition.
    /*if(pre-condition){Statement A
      if (Condition1){StatementB}
     }
     Statement A:only if precondition is true
     only statementA:if precodition is true, conditional is false
     StatementB:if precondition os true , and condition is true
     only statementB:imposible
    */
    //if multipple scenario execution depends on a spesific requirment
    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = true;
        if (USCitizen) {
            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You must be 18 or older to be abmle to vote");
            }

        } else {
            System.out.println("Only the US Citizen are eligible to vote for Donalt Trump ");
        }
        System.out.println("==========================================");

        int score = 98;
        String grade = " ";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            grade = "Invalid";
        }//score <0 or score>100
//==========================================================
        int score2 = 100;
        String grade2 = " ";
        if (score2 >= 0 && score2 <= 100) {
            grade2 = (score2 >= 90) ? "A" : (score2 > 80) ? "B" : (score2 > 70) ? "C" : (score2 > 60) ? "D" : "F";}
       else{
                grade2 = "Invalid";
            }
            System.out.println(grade2);  //Invalid
        }
    }





























