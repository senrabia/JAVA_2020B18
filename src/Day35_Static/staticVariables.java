package Day35_Static;

public class staticVariables {
    /* Instance: every single object of the class has its own copy
local variable: variables that are declared in a block
instance variables: declared outside the blocks
static: class member, can be called through the class
            there is only one copy of static shared by all objects
            prefers to be called through class name
======================================================
  JAVA IS A ;
    static members:
            1. static variable (global variables)
            2. static methods
            3. static initializer block
            4. static nested class
static variable: declared outside any block with static keyword



     */
    int a2=200; //instance variable
    static int a3=300;  //static

    public static void main(String[] args) {
        int a1=100;    //local veriable.

        staticVariables obj1= new staticVariables();
        obj1.a2=1000;
        obj1.a3=3000;

        staticVariables obj2= new staticVariables();
        obj2.a2=4000;
        obj2.a3=5000;


        System.out.println(obj1.a2);
        System.out.println(obj2.a2);
        System.out.println(obj1.a3);
        System.out.println(obj2.a3);
        System.out.println(obj1.a2+""+obj1.a3);
    }
}
