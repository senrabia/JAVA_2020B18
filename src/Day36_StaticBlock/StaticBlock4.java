package Day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {
   static String name="Cybertek School";
   static Tester tester1=new Tester();
 //  tester1.setTesterInfo("Muhtar",123,"SDET",120000);
    //Will give an error
    int insVariable; //Instance veriable so not static will not execute


    static {  //design for static only
              //gets executed as soon as the class is loaded
              //designed to initilizatize static variables
             //first static will executed last one

        name="Cybertek School";
        tester1.setInfo("Muhtar","SDET",12000,1234567);
        tester1.setInfo("Namik","SDET",12000,11234567);

        //will execute top to bottom so result tester1 when.
        //Will call bottom will execute last one

       StaticBlock4 obj1=new StaticBlock4();
       obj1.insVariable=300;
       //now instance veriable with static // DO NOT use static block for initiliazing instance variables
        //Will calling with create object with call class a
        //But does not use instance veriable with static
        // DO NOT use static block for initiliazing instance variables
         System.out.println(name);  // it will get Cybwertek school
         System.out.println(tester1);
         StaticBlock4 obj2=new StaticBlock4();
         System.out.println(obj2.insVariable);
    }

        public static void main(String[] args) {
        System.out.println(name);  // it will get Cybwertek school
        System.out.println(tester1);
        StaticBlock4 obj2=new StaticBlock4();
        System.out.println(obj2.insVariable);
    }
}
