package Day4_JavaRecap;

public class EvenOdNumber {
    public static void main(String[] args) {
        // EVEN= cift 0.2.4.6.8.10 sayilar
        // OD NUM=tek 1.3.5.7.9 sayilar
        boolean evenNumber= 25 % 2==0;      //even  num
                                            //1==0==>false
        //if 25 /2 has a reminder of zero, then it's even number.
        System.out.println(evenNumber);     //false
        System.out.println(25%2);
        System.out.println("=================================");

        boolean oddNumber=22 % 2!=0;         //odd number
                                            //0!=0 ==>false

        System.out.println("10 is even number:"+(10 % 2==0));
        System.out.println("11 is even  number:"+(11 % 2==0));
        System.out.println("25 is odd number:"+(25 % 2!= 0));
        System.out.println("25 is even number:"+(25% 2== 0));
        System.out.println("25 is even number:"+!(25% 2!=0));
        System.out.println("==================================");

         boolean r1=!true;                     //false
        System.out.println(r1);                 //false
        System.out.println(!r1);                // true
        System.out.println(!true==false);        //true
        System.out.println(!true!=!false);       //true



    }
}
