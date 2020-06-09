package Resources;
//14:30
import Day42_Inheritance.Accesmodifiers;
public class Inheritance2 extends Accesmodifiers {
     //       sub                  super
    /*publicVariable
      protectedVariable

      publicMethod
      protectedMethod
     */
     public static void main(String[] args) {
         System.out.println(Inheritance2.publicVariable);
         System.out.println(Inheritance2.protectedVariable);
      // System.out.println(Inheritance2.defaultVariable);

         Inheritance2.publicMethod();
         Inheritance2.protectedMethod();
      // Inheritance2.defaultMethod();


     }

}
