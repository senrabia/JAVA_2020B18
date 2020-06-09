package Day42_Inheritance.Task02;
//--3
public class DeviceObjects {
    public static void main(String[] args) {
        TV tv1=new TV("Samsung","E250",500,"TV","40 inches");
        tv1.country="USA";  //Print us "USA" because Static
        System.out.println(tv1);

        Phone phone1=new Phone("Iphone","11",1000,"phone","large");
        System.out.println(phone1);

    }
}
