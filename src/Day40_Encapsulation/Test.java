package Day40_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
       // System.out.println(obj.SSN); //EROR
        System.out.println(obj.getSSN());//GET
      // obj.SSN=123456;  //C.EROR
       obj.setSSN(123456);

     // System.out.println(obj.SSN); //C.EROR
        System.out.println(obj.getSSN());//123456



    }
}
