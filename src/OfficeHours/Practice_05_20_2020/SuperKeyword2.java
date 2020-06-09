package OfficeHours.Practice_05_20_2020;
//16:55

import org.w3c.dom.ls.LSOutput;

class TestData{
    int num=100;
    String name="Cybertek";
        public void method(){
        System.out.println("Cybertek School");
        System.out.println("=======================");
    }  }

    public class SuperKeyword2 extends TestData{
    int num=200;
    String name="Mit";

     public void method(){
        System.out.println("MIT School");
        System.out.println("==========================");
    }
        public SuperKeyword2(){ //Costructor
        super.method(); //Cybertek School
        System.out.println(this.num); //200
        System.out.println(super.name);//"Cybertek"

    }

        public static void main(String[] args) {
            SuperKeyword2 obj=new SuperKeyword2();
        }
}
