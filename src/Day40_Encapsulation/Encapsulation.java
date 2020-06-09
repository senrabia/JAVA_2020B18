package Day40_Encapsulation;
/*
Encapsulation: Private ECCESS modifier
Encapsulation:1. hiding the Data by giving private acccess modifier
              2.
GETTER=We can provide only getter in a class ..  (READ ONLY)
SETTER= WRITE ONLY modifiye
//KISACA=private deger verildikten sonra PUBLIC GET and PUBLIC SET olusturulacak
 */
public class Encapsulation { //Encapsulation: hiding the Data
    //What should be return another page we can (USED GET)
    private long  SSN;
    //getter: READ ONLY

    public long getSSN(){ return SSN; }
    //we should be USED INSTANCE VERIABLE
    // Baska yerde kullana bilbek icin INSTANCE KULLANMALIYIZ
    //setter:Write only

    public void setSSN(long SSN){ this.SSN=SSN; }}
