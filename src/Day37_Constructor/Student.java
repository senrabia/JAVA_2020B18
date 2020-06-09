package Day37_Constructor;
//--3
public class Student {
    // nmae, age, genderr(M/F), and University

    String name;
    int age;
    char gender;
    String university;

    public Student(String name, int age,char gender,String university) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

}

    public void setInfo(String name, int age,char gender,String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }

    public String toSting(){
        return"Name: "+name+", Age:"+age+", Gender:"+gender+", University:"+university;
    }
}
