package Day42_Inheritance;
//14:42
/*constuctor calls:
   1.at least one parent class'costructor MUST be called in sub class
   2.if the constructor in parent class in default, it's called automaticaly in child class.


 */

class test{  //    extends Constructor{ L EROR
    public test(){
        System.out.println("A");       //("super class' default costructor");
    }

}
public class Constructor extends test {
    public Constructor(){
        System.out.println("B");            //("sub class' default constructor");
    }

    public static void main(String[] args) {
       // test obj=new test();  //A
        Constructor obj=new Constructor(); //AB


    }
}
