package Day38_Constructor;
//--11
/*
static block:executed first, one time only, DOES NOT depend on the
instance block:depends on the pobject,RUNS before the constructor
constructor: depends on the pobject,RUNS after the constructor

 */

public class Test {

  //  static{
    //    System.out.println("Static block");}

    {
        System.out.println("Instance block");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        new Test(); // instance, constructor
       // new Test(); // instance, constructor
    } static{
        System.out.println("Static block");
    }
}
