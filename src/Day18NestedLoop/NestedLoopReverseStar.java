package Day18NestedLoop;

public class NestedLoopReverseStar {
    public static void main(String[] args) {
        /*  *
            * *
            * * *
            * * * *
            * * * * *
            Not: J yi i nin onunue alinca ucgen oluyor digerturlu kare.
         */
        for(int j=1; j<=9; j++){   //
            for(int i=1; i<=j; i++){//BURAYA J'IS VALUE IT COULD BE GOOD
                System.out.print("* ");
            }
            System.out.println("");

        }
        System.out.println("============================");
        for(int j=9; j>=0; j--){   //
            for(int i=1; i<=j; i++ ){//BURAYA J'IS VALUE IT COULD BE GOOD
                System.out.print("* ");
            }System.out.println(""); }
        System.out.println("============================");
        /*     a
        *      a b
        *      a b c
        *      a b c d
        *      a b c d e  */

        for(char z='a'; z<='z'; z++) {

            for (char ch = 'a'; ch <=z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }System.out.println("==============================");

        for(char zl='z'; zl>='a'; zl--){

            for (char ch2 ='a';  ch2<=zl;  ch2++) {
                System.out.print(ch2 + " ");
            }
            System.out.println(); }





        }
    }

