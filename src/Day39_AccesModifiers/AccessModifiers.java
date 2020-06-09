package Day39_AccesModifiers;
//AMod 1--
public class AccessModifiers {
    //PUBLIC=HERKES HERYERDEN HER SEKILDE ULASABILIR ACCESS
    //PRIVITE= JUST A SAME CLASS ICINDE USED DID NOT ANOTHER PLACE ACCESS
    //DEFAULT=ONLY SAME PACKAGE ICINDEKI DEFAULT ICINDEKI BUTUN SAYFALARDA ACCESS

    /* acces modifier: public,default,privite
     methods:
     variables:
    public: open to the world, accessible at everwhere
    protect:
    default: only accesible witin same package  when we dont provide public,privite or protected keyword , the access modifiers will be default
    privite: only accesible int the same class privite (kisiye ozel)
 */

        int defaultAccess=1000; //default:only accesible in same package
        public int publicAccess=2000;  //open the the world

        private long SSN=123456;
}
