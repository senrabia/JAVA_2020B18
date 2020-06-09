package Day35_Static;

public class StudentObject {
    public static void main(String[] args) {
        Students student1=new Students();
       student1.name="Rabia";
        System.out.println(student1);

        Students student2=new Students();
        student2.name="Kuzzat";
        System.out.println(student2);

        Students.printSchoolName();

    }
}
