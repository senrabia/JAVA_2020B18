package Day6_Relation_Op;

import java.sql.SQLOutput;

public class Logical_OR_Oper {
    public static void main(String[] args) {
        /*___OR LOGIC OPERATOR= logical operatorler mutlaka BOOLEAN doner T==F
       9>8  ||  10 > 12 ==> true______true || false ==> true
       10!=10 || 10>9  ==> true_______ false ||true  ==> true
       8>5  || 10>9  ==> true________ true  || true ==> true
       15<5 || 7!=16 ==> false_______ false || false ==>false
             The only logic returns False is when both condition are ==>false Otherwise ==>true
             9>8  ||  10 > 12 ==> true */
        boolean R4= true!=false||false==!true;// true || false==> true
        boolean R5= true!=false && false==!true;//true && true ==>true
        boolean R6=!!!false;    // Burda OD__EVEN number devreye girer eger ==>true
                                // !!!  OD  ise degil !!!!EVEN ise kendisi olur
        System.out.println(R4);
        System.out.println(R5);
        System.out.println(R6);





    }
}
