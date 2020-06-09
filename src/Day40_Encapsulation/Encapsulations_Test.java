package Day40_Encapsulation;
import Day40_Encapsulation.Encapsulation;


public class Encapsulations_Test {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation(); //EROR
         //obj2.SSN=1000; //C.EROR
         //System.out.println(obj.SSN);

        System.out.println(obj.getSSN()); //0 //ic parantezi unutma
        obj.setSSN(123);
        System.out.println(obj.getSSN()); //is that working

    }
}
