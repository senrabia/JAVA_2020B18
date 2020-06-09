package Day37_Constructor;
//--5
public class CybertekStudents {
    static String schoolName;
    String studentName; //We MUST need to KNOW
    int groupName;      //We MUST need to KNOW
    String batch;      //We MUST need to KNOW

    public CybertekStudents(String studentName, int groupName, String batch) {
        //schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupName = groupName;
        this.batch = batch;

    }

    public String toString() {
        return "Name: " + studentName + ", Batch: " + batch +
                ", in group: " + groupName + ", SchoolName: " + schoolName;
    }
}
class Objects{
    public static void main(String[] args) {
        CybertekStudents students1=new CybertekStudents("Rabia",8,"Batch 18");
        students1.schoolName="MIT";   //Importatnt is that cower both student1,student2..

        System.out.println(students1);
        CybertekStudents students2=new CybertekStudents("Sarah",12, "18");
        System.out.println(students2);

    }
}
