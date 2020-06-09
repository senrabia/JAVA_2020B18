package OfficeHours.Practice_03_18_2020;

public class SHO_Practice {
    public static void main(String[] args) {
        // +=: addition assignments
        int a=100;
            a=a+200;
            a+=200;            //a=300
        System.out.println(a);
            a+=200*3;           //a=600
        System.out.println(a);  //a=600+300=900
        // -=: subtraction assignmet
                                //a=a-400;
            a-=400;             //=500
        System.out.println(a);
        int b=300;
            b-=3*40;            //b-=120;==>180
        System.out.println(b);
        // *=:multipication assignment
        int x=5;                //x=*3;//15
            x*=3;                      //15
        System.out.println(x);
            x*=2+1;              //x*=3; x=x*3 ==> 45
        System.out.println(x);
        // /=: division assignment
        int n=900;
        n/=3;                      //n=n/3; same
        System.out.println(n);
        n/=3*5;                    //n=n/15 ==> 20 same
        System.out.println(n);
       // %=:remainder assignment
        //FORMULA____remainder:numarator-(denominator*Whole Number for result)
        int m=10;
            m%=3;                   //m=m%3; //1 same

        int y=300;
            y%=3*5;                //y%=15; ==>y=y%==>y=0
        System.out.println(y);
        int t=400;
            t%=10*2;               //t%=20;==>t=t%20;==>t=0;
        System.out.println(t);

    }

}
