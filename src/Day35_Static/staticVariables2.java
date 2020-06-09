package Day35_Static;

public class staticVariables2 {
    /*  Instance: every single object of the class has its own copy
local variable: variables that are declared in a block
instance variables: declared outside the blocks
static: class member, can be called through the class
            there is only one copy of static shared by all objects
            prefers to be called through class name
  ==================================================
    static members:
            1. static variable (global variables)
            2. static methods
            3. static initializer block
            4. static nested class
static variable: declared outside any block with static keyword
 */
    int insVariable; //every single object of the class has its ovn copy.
    static int staticVariable; //there is only one copy of static shared by all object

    public static void main(String[] args) {
        staticVariables2 obj1=new staticVariables2();
        obj1.insVariable=300;
        obj1.staticVariable=400;

        staticVariables2 obj2=new staticVariables2();

        System.out.println(obj1.insVariable); //300
        System.out.println(obj2.insVariable); //0

        System.out.println();

        System.out.println(obj1.staticVariable); //400
        System.out.println(obj2.staticVariable); //

        System.out.println();

        System.out.println(staticVariables2.staticVariable); //static can be called through class name
     // System.out.println(staticVariable.insVariable); //EROR=> instance CAN NOT be called through clas name

    }


}
