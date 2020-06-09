package KizlarCaySaati;

import java.text.DecimalFormat;

public class Decimal22Nisan {
    public static void main(String[] args) {
        DecimalFormat decimalFormat=new DecimalFormat("0.000");
        double a=10.0/3.0;
        System.out.println(a);//3.3333333333333335
        System.out.println(decimalFormat.format(a)); //3.333
//==========================================================
//DecimalFormat decimalFormat=new DecimalFormat("0.000");
 //  System.out.println(decimalFormat1.format(a));


    }
}
