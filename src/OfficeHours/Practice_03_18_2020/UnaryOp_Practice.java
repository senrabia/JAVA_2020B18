package OfficeHours.Practice_03_18_2020;

public class UnaryOp_Practice {
    public static void main(String[] args) {
        //POST___:first passes the value, then increase it by 1
        int a=20;
        System.out.println(a++);    //20
        System.out.println(a);      //21
        int b=30;
        int c=b--;                  //c=30, b=29;
        System.out.println(b);      //29
        System.out.println(c);      //30
        int d=40;
        int e=d++;                  //e=40, d=41
        System.out.println(d);
        System.out.println(e);
        //PRE______:It is increase immediatily.
        //INCRAMENT__DECRAMENT
        int x=200;
        System.out.println(--x);    //199 if it is x--=200; olurdu.
        System.out.println(x);      //199
        int z=100;
            z=z++ + --z - z-- + ++z; //z=100+100-100+100
                                     //200;
        System.out.println(z);
        int u=900;
        int r=- ++u + ++u + -u++;  //-901+902+-902
        System.out.println(r);     //901

    }
}
