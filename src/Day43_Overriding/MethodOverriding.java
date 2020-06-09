package Day43_Overriding;
//11:00
//access modifier: public > protected > default > private

/*Method Overriding=-same method name, same parameter, same return -taype(MUST)
                    -MUST happen in the sub class
                    -access modifier MUST be same or more visible
                    -ONLY the instance methods can be overridden
                    -@Override annotation MUST be applicable
why we need overriding:to implement different fonctions to the same method
@Override: ***Identifies if the method is overriden method.
*/


class Test{
    public void method(){
        System.out.println("Onur");

    }
}public class MethodOverriding extends Test{
      // @Override did not working
        public void method(){//same method name, same parameter, same return type MUST
        System.out.println("Zarina");

    }
    public static void main(String[] args) {
        Test obj1=new Test();
         obj1.method();  //Onur

        MethodOverriding obj2=new MethodOverriding();
         obj2.method(); //Zarina
    }

    }
