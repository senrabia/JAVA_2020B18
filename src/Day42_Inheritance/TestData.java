package Day42_Inheritance;
//--6//2 data


public class TestData extends Data {
/*    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outisde packagfe
    default: only visible in same package
    private: only visible within the same class  */

/* public
   defult
   protected
 */
public static void main(String[] args) {
    System.out.println(TestData.publicData);
    System.out.println(TestData.protectedData);
    System.out.println(TestData.defaultData);
    //System.out.println(TestData.privateData); //private can never be Inheritade
}

}

