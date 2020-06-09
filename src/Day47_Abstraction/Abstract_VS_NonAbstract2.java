package Day47_Abstraction;




abstract class A {
    public abstract void method1();
    public void method(){}
}
public class Abstract_VS_NonAbstract2 extends A { //MANDATORY to override the abstract method
   //2 methods
    public void method1(){}
}

abstract class B extends A { //optional to override the abstract method of A
 //One Abstract one Instance methods
//public abstract void method1();
}
//==================================================
 class C extends B{
//It has inherited abstarct class B.

    public void method1() {

    }}