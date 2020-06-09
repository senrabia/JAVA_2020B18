package Day21_MultiDeminasionalArray;

import java.text.DecimalFormat;
public class FormattingDecimals {
    public static void main(String[] args) {
   /* DecimalFormat:used for rounding the decimals
        presented in "java.text"
      ==> DecimalFormat DF=new DecimalFormat("0.00")//rounds to the second decimal.
      ==> DecimalFormat DF=new DecimalFormat("0.00")//rounds to the second decimal.

        */
        DecimalFormat DF=new DecimalFormat("0.00");//rounding the decimals

        double a=10.0/3.0;
        System.out.println(a);
        System.out.println(DF.format(a));
        System.out.println();
        System.out.println(DF.format("2.346789")); //2.35 it torn.

    }
}
