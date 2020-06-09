package Day48_Abstraction;
//15:25

interface P{
  void method1();
}
interface Q {          //extends P {    //implements P{ implements EROR
   int method2();
}
abstract class R{
  abstract void method3();
}

public class extends_implements2 extends R implements P, Q {
    public static void main(String[] args) { //R obj=new R()

    }
    @Override
    public int method2() {
        return 0;
    }
    @Override
    void method3() {

    } //Burda extend her zamn once kullanilmali yoksa EROR verir.
    @Override
    public void method1() {

    }
}
