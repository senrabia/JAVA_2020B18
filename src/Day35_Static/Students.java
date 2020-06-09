package Day35_Static;

public class Students {
    /* Attrubute:
    name,id gpa,
    SchooleName:"Cybertek";
    actions:
    setInfo():name,id,gpa
    printSchoolName();
    toString

     */
  String name;
  int id;
  double gpa;
  static String school="Cybertek";

  public  void setInfo(String name, int id,double gpa){
  //IMPORTANT=. if we are using any instance , the method should not be static
      this.name=name;
      this.id=id;
      this.gpa=gpa;
  }
  public static void printSchoolName(){

      System.out.println("School name is "+school);
  }
  public String toString(){

      return "Name: "+name+", School Name: "+school;
  }

}
