package OfficeHours.Practice_05_20_2020;
//16:23
/*Constructor calls:
1.at least ons Must be called in sub class.
2.default Cons of super class is called automaticaly in sub class.
3.parent class' constructor with ar not default MUST be called manualy in sub class

 */
class Test{//Class (super i calistirir burda)

    public Test(int a){ //super(10);

        System.out.println("A");
    }
}
public class Constructor extends Test {
    public Constructor(){
         super(10);
        System.out.println("B");

    }

    public static void main(String[] args) {
        Constructor onj=new Constructor();
    }

}
