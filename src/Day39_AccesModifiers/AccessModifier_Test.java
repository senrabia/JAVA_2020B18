package Day39_AccesModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifiers obj=new AccessModifiers();

        System.out.println(obj.defaultAccess); //default:only accessible in same package
        System.out.println(obj.publicAccess);  //open to the word

        //System.out.println(obj.SSN);  //privite: only accessible within the same class

    }

}
