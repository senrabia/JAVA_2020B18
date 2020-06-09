package OfficeHours.Practice_03_18_2020;

public class LogicalOperators1 {
    public static void main(String[] args) {
        //___  ||, &&, !
        boolean r1="muhtar" != "Bad guy";  //false
        System.out.println(r1);
        boolean r2="muhtar" != "Good guy";  //true
        System.out.println(r2);
        boolean r3=10>=9;                   //true
        System.out.println(r3);
        boolean r4=!false==!true;          //false
        // true==false ==>false
        System.out.println(r4);
        //RUULS___||:as long as one condition is true==>true
        boolean result1=9!=8 || 9==8;
                       //true || false==>true
        System.out.println(result1);
        boolean result0=9!=8 && 9==8;
                       //true&&false ==>false
        boolean result2='a'=='A'||'A'=='b';
                      // false  || false==>false
        //RUULS ___&&:as long as one condition is false ==>false
        boolean result3=6>5&& 6<4;
        System.out.println(result3);
        boolean result4=!false!=true&&!true==false;
                      // T       F  && F      F
        System.out.println(result4);








    }
}
