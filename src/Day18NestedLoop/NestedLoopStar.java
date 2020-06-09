package Day18NestedLoop;

public class NestedLoopStar {
    public static void main(String[] args) {
      /*    ******
            ******
            ******
            ******
            ******
            ******
       */
       for(int i=0; i<7; i++) {

           int a = 1;
           while (a <= 25) {  //buraya gore sayi degisiyor.
               System.out.print("* ");
               a++;
           }
           System.out.println();

       }
    }
}
