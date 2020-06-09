package Day16_Loop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*for(initilizasion; condition; iterator){
       *statement that wanna repeat}
       *    initilization:starting point==>int a=0; herhangi birisi kull. ==>int i=10
       *    Condition: created based on the initilizatiosn ==>(TRUE OR FALSE) ==>i>0
       *    iterator: co-related to the condition.
       * Needs to be capable enough to make the condition false.
       *    if the condition of
        */
        /*odd number between 1~100 in a single line spereted by a speace.
                            1,3,5,7,9
         */

        String resultOdd="";
        for(int number=1; number<=100; number +=2){
          //  System.out.println(number+ " ");
          // resultOdd+=resultOdd+number+ "";}

        System.out.println(resultOdd);}
        /*Even number between 0~100
                           2 4 6 8 10...
         */
        String resultEven="";
        for(int number=2; number<=100; number+=2){
            resultEven+=number+"";}
            System.out.println(resultEven);
        }




    }


