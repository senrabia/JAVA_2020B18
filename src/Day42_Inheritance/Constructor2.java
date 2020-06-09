package Day42_Inheritance;
//15:00
/* this:refers to the object instance of the current class
   this(): used for calling the costructors from current class.
   this.:used for calling instance variable and instance method

   super:() refers to the object instance of the super class(parents  class)
   super.:used for calling the instance variables and instance

constuctor calls:
   1.at least one parent class'costructor MUST be called in sub class
   2.if the constructor in parent class in default, it's called automaticaly in child class.


 */
//WERY IMPORTANT ==> THIS KEYWORD
class Test{
    public Test(int a){
        this(2.5);
        System.out.println("A");
    }
    public Test(double a){
        System.out.println("C");
    }
}
public class Constructor2 extends Test {
    public Constructor2() {  //C.EROR (if add extends Test) SUPER calss add after working.
        super(10);         //SUPER  ****very trick *** a.15=>AB //a.15.5=>CB
        System.out.println("B");
    }

    public static void main(String[] args) {
       Test obj = new Test(10);  //if we do not add (int 10 )C.EROR
       // Constructor2 obj2 = new Constructor2(); // AB
    }
}