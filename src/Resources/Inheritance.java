package Resources;
/*    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outisde packagfe
            protected is always visible to any sublcass
    default: only visible in same package
    private: only visible within the same class  */



import Day42_Inheritance.Data;
import Day42_Inheritance.TestData;


public class Inheritance extends Data {
//              sub              super


    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        //System.out.println(TestData.defaultData);
       // System.out.println(TestData.privateData);
    }
}
