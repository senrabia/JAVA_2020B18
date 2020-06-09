package Day40_Encapsulation;

public class Quiz_Question12 {
    public static String name="Osman";
    public Quiz_Question12() {
        name = "Hilal";
    }
    {
    name="Marionela";
    }static {name="Madina";}

    public static void main(String[] args) {
        System.out.println(name); //"Madina"
        Quiz_Question12 obj= new Quiz_Question12();
        //name=Madina
        //name="Marionela"
        //name="Hilal"
        System.out.println(name); //"Hilal"
    }
}
