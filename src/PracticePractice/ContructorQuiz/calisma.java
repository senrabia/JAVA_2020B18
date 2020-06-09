package PracticePractice.ContructorQuiz;

import OfficeHours.Practice_05_13_2020.Constructor;
import org.w3c.dom.ls.LSOutput;

public class calisma {
    //INSTANCE VERIABLE
    // int a=10;
    int a;    // instance veriable

    public static void main(String[] args) {//each has its oven copy of instance variable
        calisma obj1 = new calisma();
        System.out.println(obj1.a);// 0 cunku atanmis deger yok

        obj1.a = 100;
        System.out.println(obj1.a); //100
        //==========================================
        calisma obj2 = new calisma();
        obj2.a = 200;
        System.out.println(obj2.a);  //200  // ne kadar object create edersen degeri hepsinin farkli olacaktir
        //==========================================
        calisma obj3 = new calisma();
        System.out.println(obj3.a);  //0 5 inci satirdaki int acilirsa bos degerlerin hepsi o sonucu verir
        System.out.println("============= LOCAL VERIABLE ==============");
        double num = 100.5;  //local veriable
        System.out.println(num);  //100.5
    }

    public static void method(String[] args) {
     //  System.out.println(num);  // you can not access to local variable because lokal variable only visible within the method
    }
}
     //======== STATIC VARIABLE
     //========================
class staticVariable{
    static int b=300;

         public static void main(String[] args) {
             staticVariable obj1 = new staticVariable();
             System.out.println(obj1.b); //300
             System.out.println(staticVariable.b); //300  //deger tanimlamadan usttte verilen static variable degeri oomatic aliyor ama instanc veriable deger
             //tanimlaman gerekiyor object create edrken
         }}
  //===========================================
  class staticName {
      static String name;
      int a = 20;

      public static void main(String[] args) {
          staticName obj1 = new staticName();
          obj1.name = "Melek";
          System.out.println(name);  //Melek  //Static veriable direk name yazip print edbiliyorsun
          System.out.println(obj1.name);  //Melek //Top the mbottom Melek

          staticName obj2 = new staticName();
          obj2.name = "Irem";
          System.out.println(name);   //Irem
          System.out.println(obj2.name);//Irem
          System.out.println(obj1.name); //Irem

          staticName obj3 = new staticName();
          // System.out.println(staticName);  // it give me Eror //instance variable share object not class
          System.out.println(obj3.a);  //20
      }
  }
          //STATIC METHOD ONLY ACCEPTS CLASS MEMBERS
          //============================================
          //STATIC AND INSTANCE METHOD
          //Staic method only accepts static features id fmethod is not a static can not call to in static methods (a main methods)

      class Rabia{
          public static void method1(String[] args) {
              System.out.println("Lets go");
              //Rabia.method1();//you can not because non static
          }
           public void method2(){
              System.out.println("Hadi gidelim");
              //Rabia.method2();

          }

          public static void main(String[] args) {
              //Rabia.method1();
              Rabia obj=new Rabia();
              obj.method2();

          }
      }









