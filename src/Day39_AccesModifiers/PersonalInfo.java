package Day39_AccesModifiers;
//AMod 2--
/*  create class for Sudent:
            instance variables:
                 name, id ,age,gender,grade,SSN
            public:  name,gender
            privite: grade, SSN, id ,age

 */
public class PersonalInfo {
    //BUTUN PAKETLERDE-CLASS LARDA ORTAK OLARAK CALISIR HIC BIR SORUN OLMAZ
    //public class modifier (can be access from anpoyone one anywhere)
    public static String name="Zuura";
    public static char gender='F';

  //STATIC==> AYNI PAKET ICINDEKI BASKA BIR CLASS TA DA CALISIR SORUN OLMAZ AMA BASKA BIR PAKETTE CALISMAZ
  // default:access modifier (can only access from thiss package or class even when we call from other packages with import))
   //will not work it.
    static char grade='A';
    static int age=18;
//PRIVATE==> SADECE TANIMLANMIS OLAN SAYFADA CALISIR BASKA CLASS VEYA PAKETTE CALISMAZ
//privite access modifier (can only access from this class not inside this package other classes or from anywhere)
    private static long SSN=901234;
    private static long ID=9876543;

}
