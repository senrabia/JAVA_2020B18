package OfficeHours.Practice_05_13_2020;
/*METHOD OVERLOADING
same method(Parameter MUST BE different)
 */
public class Constructor_Overload {

   public Constructor_Overload() {
       System.out.println("default ");
   }
   public  Constructor_Overload(int a){
       System.out.println("constructor with int");

   }
    public  Constructor_Overload(int a, double b){
        System.out.println("constructor with int and double ");}
//==================================================================
    public static void main(String[] args) {
       Constructor_Overload obj=new Constructor_Overload(10,10.0);

    }
}
