package Day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
     Person Zarina=new Person("Zarina"); //should be objejct
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN); //it can not access

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN "+Zarina.getSSN());

       // System.out.println(Zarina.ID);
        Zarina.setID(123123);
        System.out.println("Zarina' ID: "+Zarina.getID());


    }
}
