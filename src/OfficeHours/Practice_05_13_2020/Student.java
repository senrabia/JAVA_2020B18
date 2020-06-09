package OfficeHours.Practice_05_13_2020;

public class Student {
    /*Student:
       ins variables: name, id
       instance methods: to String
     */
    //static String name; //Rabia  Rabia  Rabia
    String name;     //Madina ,Emrah, Rabia
    long id;
    static String schoolName = "Cybertek"; //


    public String toString() {
        return "Name: " + name + ", id: " + id + ", School Name: " + schoolName;
    }

    public static void printSchoolName() {
        System.out.println(schoolName + "School");  //bunu neden ekledi bak
    }
}
class studentObjects{
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Madina";
        student1.id=1111;
        Student student2=new Student();
        student2.name="Emrah";
        student2.id=2223;
        Student student3=new Student();
        student3.name="Rabia";
        student3.id=3333;

        student1.schoolName="Harvard"; //TRY

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }

}


