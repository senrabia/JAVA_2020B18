package Day6_Relation_Op;

public class Logical_AND_Op {
    public static void main(String[] args) {
      //   &&  and_______|| or_________! not
      //Relation Operators: retorns boolean
      // !true==>false__________!false==>true
        boolean result1=true;
        System.out.println(result1);        //false
        boolean result2=10+15>15;           //true
        boolean result3=!(10+15>15);        //false turn.
        boolean result4=!true==!true;       //
        boolean result5=false==true;        //false
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        /*___LOGIC RUULS= And Logic ruuls
         && AND= true && false ==> false // 5==5 && 3==5 ==>false
                 false && true ==>false  // 10>12 && 10<11 ==>false
                 true && true ==> true   // 10!=12 && 10!=9 ==>true
                 false && false ==> false //
                 The only time and logic returns true is when condition ==>true otherwise ==>false
                 Just==> true && true ==> true ____*/
        boolean r1="Corona Virus"!="End of the world"&&"Toilet Paper"=="Cure"; //==>false
                // ____________true__________________&&_______false_________
        boolean r2=10>15 && 15<13;              // false && false ==>false
        boolean r3='a'=='b'-1 && 'b'+1=='c';    //true && true ==>true
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);







    }
}
