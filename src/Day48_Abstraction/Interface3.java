package Day48_Abstraction;
//14:20
public  interface  Interface3 {
    public void method1();

    public abstract void meethod2();
    static final int num=100;// by default public.
    int num2=300; // by default: public static final

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(num2);


    }

    static void method3() {

    }

}
