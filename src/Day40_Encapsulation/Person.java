package Day40_Encapsulation;

public class Person {
    public String name;

    private long SSN;
    private int ID;

    public Person(String name) { this.name = name; }

    public long getSSN() { return SSN; }

    public void setSSN(long SSN) { this.SSN = SSN; }
    public int getID(){return ID;}
    public void setID(int ID){ this.ID=ID; }
    public void setSSNandID(long SSN,int ID){
    //THIS PART VERY IMPORTANT=  we used two variable both
       /* setSSN(SSN);
          setID(ID);   */
       this.SSN=SSN;
       this.ID=ID;
    }
}