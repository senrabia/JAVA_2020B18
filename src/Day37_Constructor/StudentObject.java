package Day37_Constructor;
//--3 object
public class StudentObject {
    public static void main(String[] args) {

      Student student1=new Student("Rabia",40,'F',"Cybertek");//Existing Costructor ()
     // student1.setInfo("Rabia",40,'F',"Cybertek");
        System.out.println(student1);

        Student student2=new Student("Sha",35,'M',"Cybertek");
        System.out.println(student2);

    }
}
