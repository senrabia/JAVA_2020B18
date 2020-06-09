package Day36_StaticBlock;

import Day34_CustomClass.Tester;

public class StaticBlock3 {
    static String name;
    static int num;
    static Tester tester1;
/* -there is only one copy of static chared by all object s will work only one time not repeat
  for both.
  witout main will not work so that is have to be there

    */
    static {
        name = "Rabia";
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("Rabia", 123456, "Apple", 123456);

    }

    public static void main(String[] args) {
        //Static blok call another block
        name = "Rabia";
        num = 200;
        System.out.println(name);
        System.out.println(num);
    }
}

