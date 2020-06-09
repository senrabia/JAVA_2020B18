package Day38_Constructor;
//--9
/*c*onstructor calls:  //CERTIFICATION EXCEM
1. Only constructor can call other constructer
2.Constructor cannot be called by its name, this() is used for calling
3.Constructor call needs to be at the first step.
4.One Constructor can only call one constructor. it can NOT call more than one.
5.Constructor CAN NOT  Call itself, or CONTAIN Itself

*/
public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(9);  //int argument
        System.out.println("default");
    }
    public ConstructorCalls3(int a){
       // this(10);// eror it CAN NOT CALL Itself
        System.out.println("Int argument");
    }
    public ConstructorCalls3(String str){
       // this("Hello");//eror it CAN NOT CALL Itself
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
    public void method1(){
       //this();
    }
}
