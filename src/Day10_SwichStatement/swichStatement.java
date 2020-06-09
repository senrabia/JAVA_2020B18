package Day10_SwichStatement;

public class swichStatement {
    /*SWICH STATEMENT is
    Syntex:
        swich(expression){
             case caseValue1:
                   statement;
                       break;
             case caseValue2:
                  statement;
                      break;
             case caseValue3:
               default:
             statement;
                 break;
           }
         ==> Switch statement' expression cannot be boolean case values MUST be matching with
           the switch statement's expressions.
         ==>caseValue:MUST be matching with the switch statement's expression
            caseValue:MUST be Unique
         ==> default: gets executed if none of case are matching.
         ==> break statement:use for exiting the swich stament' block if we do not give break
         statement, than the next available code fragments in switch will be executed.
         ==>RUULS=> switch does not accept: long, float, double, boolean
         */
    public static void main(String[] args) {
        byte a=4; //RUULS==>We can use just==>swich(4)
        switch(a){ // RUULS==>float, long, double, boolean give me EROR
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
                default: //RUULS==> not important defult place
                    System.out.println("Invalid case");
                    break;



        }




    }



}
