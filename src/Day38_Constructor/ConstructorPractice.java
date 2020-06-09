package Day38_Constructor;
//--10
/*
1. Only constructor can call other constructer
2.Constructor cannot be called by its name, this() is used for calling
3.Constructor call needs to be at the first step.
4.One Constructor can only call one constructor. it can NOT call more than one.
5.Constructor CAN NOT  Call itself, or CONTAIN Itself

 */
import org.w3c.dom.ls.LSOutput;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(10.0);  //C
        System.out.println("A");
        //this(0.5); //  rule number #3 EROR
    }
    public ConstructorPractice(int a){
        this(); // C A  and B
       // this(10.5);
        System.out.println("B");
    }
    public ConstructorPractice(double a){
       // this();//rule number#5 EROR
       // this(5.5);//rule number #5 EROR
       //this(10);  //rule number #5 EROR
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorPractice(10);
    }
}
