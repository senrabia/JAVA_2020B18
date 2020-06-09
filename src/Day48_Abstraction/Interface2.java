package Day48_Abstraction;
//12:45
public  interface Interface2 {

    //public Interface2() //Bu bir constructor. It CAN NOT CONSTRUCTOR.
    //public void method1(){}//
    //{}
    int a=100; //STATIC //Bu bir class olsaydi INSTANCE METHOD olurdu.
              //Only static & final veriable

    public static void main(String[] args) {
        System.out.println(a);// by default static
        //  a = 200; // by default final

        System.out.println( Interface2.a );
        Interface2.method4();

    }

    static void method4(){ }

    void method5();

    default void method6(){
        System.out.println("Default method");
    }


}
