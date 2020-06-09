package Day38_Constructor;
//--8
/*constructor calls:
1. Only constructor can call other constructer
2.Constructor cannot be called by its name, this() is used for calling
3.Constructor call needs to be at the first step.
4.One Constructor can only call one constructor. it can NOT call more than one.

 */
public class ConstructorCalls2 {
    public ConstructorCalls2(){
      System.out.println("Default constructor");
}

    public ConstructorCalls2(int a) {
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str) {
        //   System.out.println(" Hello");
        this(10); // default , & int arguments
        //  this();
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2("Hello");



    }

}


