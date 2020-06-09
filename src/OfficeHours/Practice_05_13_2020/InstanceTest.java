package OfficeHours.Practice_05_13_2020;
//--2

/*statics:variables
          methods
          block

 */
public class InstanceTest {
    public static void main(String[] args) {
        Instances obj1 = new Instances();
        obj1.name = "Muhtar";

        Instances obj2 = new Instances();
        obj2.name = "Kuzzat";
        System.out.println(obj1.name); // mutlaka n e isteniyorsa yazilmali
        System.out.println(obj2.name);//important
    }}

    class InstanceBlock{
        public static void main(String[] args) {
        Instances obj=new Instances();
        System.out.println(obj.name);
        //just give me a Instances page String name{  Zuura }
        }

    }

