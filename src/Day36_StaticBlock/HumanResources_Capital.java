package Day36_StaticBlock;
import OfficeHours.Practice_05_06_2020.Developer;
/*  static:runs first , only runs one time

 */
public class HumanResources_Capital {
   static Developer dev1=new Developer();
   static Developer dev2=new Developer();
   static Developer dev3=new Developer();
   static Developer dev4=new Developer();
   static Developer dev5=new Developer();

  /*  public static void main(String[] args) {
        dev1.setInfo("Namik","Developer",120000,123456); //give me a null result*/
   static {
       dev1=new Developer();
       dev1.setInfo("Namik","Developer",120000,123456);


    }
}
