package Day18NestedLoop;

public class Triangle {
    public static void main(String[] args) {
        /*  *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
         */
       int z=0;
        while(z<=7){z++;

        int i=1;
        while(i<=z){ System.out.print("* "); i++;}  //==> WHILE(I<=Z)
        System.out.println();}
        System.out.println("====================================");

        int z2=7;
        while(z2<=1){//z2 ++;

            int i2=1;
            while(i2<=z2){ System.out.print("* "); i2++;}  //==> WHILE(I<=Z)
            System.out.println();}



    }
}
