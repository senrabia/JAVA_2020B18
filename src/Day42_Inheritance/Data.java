package Day42_Inheritance;

//--5//1 data
public class Data {
    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private String privateData="private";
}

//========  Same Package and Different Class       ==================
class testing extends Data{
    // public, default, protected =INHERITED


    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        //System.out.println(TestData.privateData); //private can never be Inheritade
    }

    }