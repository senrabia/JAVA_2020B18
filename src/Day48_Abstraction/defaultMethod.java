package Day48_Abstraction;
//15:50

abstract class T {
  //  public default void method2(){}

}

public interface defaultMethod{
    default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {

    }
    class N implements defaultMethod{
        public static void main(String[] args) {
            N obj=new N();
            obj.method();
        }
    }
}


