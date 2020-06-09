package Day36_StaticBlock;

import Day34_CustomClass.Tester;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;
//IMPORTANT WICH ONE BEFORE WORKING ????  Before
   static Tester testers1=new Tester();
  public static void main(String[] args) {
       // testers1.setTesterInfo("Jean",123,"SDET",12000);  //give me a null result
        System.out.println(testers1);

    }
    static{
        a=100;
        b=200;
     //   c=300; //static only accepts static
        if(100>200){
            a=100;}
        else{b=200;}
        System.out.println(a);
        System.out.println(b);
        testers1.setTesterInfo("Jean",123,"SDET",12000);
    }
}
