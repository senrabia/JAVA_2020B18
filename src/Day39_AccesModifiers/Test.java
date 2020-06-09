package Day39_AccesModifiers;
//AMod 2--
public class Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.defaultAccess);  // Just work package or class
        System.out.println(obj.publicAccess);   // it can be work every where,

      //  System.out.println(obj.SSN);//private: only accesible within the same class



    }
}