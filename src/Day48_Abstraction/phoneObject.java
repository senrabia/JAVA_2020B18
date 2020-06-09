package Day48_Abstraction;

public class phoneObject {
    public static void main(String[] args) {
      iPhone iphone1= new iPhone("x", 1000, "10 inches");
      iPhone iphone2= new iPhone("9",900,"8 inches");
        System.out.println(iphone1);
        System.out.println(iphone2);
        System.out.println("------------------------");
        iphone1.faceTiming(123456);
        iphone1.calling(911);
        iphone1.texting(987456);

        //iphone1.freezing();
        System.out.println("========================");

        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");

        System.out.println(samsung1);

        samsung1.calling(123456);
        // samsung1.faceTiming(123456);
        samsung1.freezing();

        samsung1.texting(123456);


    }
}
