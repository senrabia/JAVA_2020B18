package Day17_WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    /*While Loop:
          while(condition){
          Statements; }
          loop gets executed as long as the condition is true.
          a reapeating if statement.
          compiler first checks the condition of the while loop, if it's true executes
          the loop, other wise stops executed.
          ==>Break Statement: exits the switch statement and loop forcefully exits
          the loop
          ==>EVERY FOR LOOP CAN ALWAYS BE CONVERTED TO WHILE LOOP
          Initilization:
          While(condition){
          statement;
          iterator
     */
    public static void main(String[] args) {


        int a = 9;    //a=9

        while (a > 8) {
            a++;
            System.out.println("Hello  Word" + a);
        }  //Hello 8
        /*Write program that can count how many time the word "book" is appered in a String??
         * */

        String sentence = "I like book, I read  book book book";
        int count = 0;
        while (sentence.contains("book")) {
            count++;
            sentence = sentence.replaceFirst("book", "");
            //can eventually the codition false
        }
        System.out.println(count);
        System.out.println(sentence);
        //BREAK STATEMENT
        int i = 0;
        while (true) {
            // int i=0;
            i++;
            System.out.println("Hello World " + i);
            if (i == 5) {
                break; //forcefully exits the loop..}
            }

        /*use while loop to print all even number between 1-100 Initilization:
          While(condition){
          statement;
          iterator**/

            for (int z = 1; z <= 100; z++) {
                if (z % 2 == 0) {
                    System.out.print(z + " ");
                }
            }

            System.out.println();

            int x = 1;
            while (x <= 100) {
                if (x % 2 == 0) {
                    System.out.print(x + " ");
                }
                x++;
            }
            System.out.println("");
            Scanner scan = new Scanner(System.in);
            System.out.println("Starting number");
            int start = scan.nextInt();   //10
            System.out.println("ending number");
            int end = scan.nextInt();
 /*WHILE LOOP
        for(int j=start; j<end; j++){
          if(j%2==0){
              System.out.println(j+"");
              }
              }*/
            int j = start;
            while (j <= end) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
                j++;
            }
        }

    }
}
