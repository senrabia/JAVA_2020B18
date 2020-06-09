package Day15_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        /*Break Statement: used for exiting switch statement and loops.
        whenever we need to forcefully stop the iter
         *
         * */
        for (int i = 1; i <= 5; i++) { //if we need 3 times==>i: 1,2,3,4,5,6
            System.out.println("Hello Word");
            //When is this excicuted??->

            if (i == 3) {
                break;
            }
        }

        for(char i='a'; i<='z'; i++){
           if(i=='d'){
              break;
            } System.out.println(i);
        }
        }
}










