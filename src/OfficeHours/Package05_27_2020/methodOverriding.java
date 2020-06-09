package OfficeHours.Package05_27_2020;
//14:00
/*  Overloding: -same method name, different parameter.
                -return type doesn't matter.
                -
    Overriding: -smae method nameb same parametr

 */
public class methodOverriding {
    //public
   protected void method1() {  //just only 1 method used.
        System.out.println("Super Class");
    }
   /*
    public void method1(int a){
    }
    @Override
    public void method1(){ }   EROR */
}

   class Test extends methodOverriding { //can used class method for Overriding.
  //@Override                            //extends methodOverriding

 public void method1(){ //onother method not work. privite, protected ,..
     System.out.println("Sub class");


 }
 public static void main(String[]args){
   /*  methodOverriding obj=new methodOverriding();
     obj.method1();  //print Super class  //WORK
      */
   Test obj=new Test();
   obj.method1();   //print Sub class
 }

   }

