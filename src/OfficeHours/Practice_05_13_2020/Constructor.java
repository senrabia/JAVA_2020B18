package OfficeHours.Practice_05_13_2020;
//--6
/*Object: new Constructor
regular methods:
access-modifier specifier return-type(MUST) methodName(Parameter)(MUST){}
Constriuctor:special method
MUST
access-Modifier ClassName(Parameter){
statements}


 */
public class Constructor {

     public Constructor(){

        System.out.println("default constructor");
}
  public static void main(String[] args) {
     Constructor obj=new Constructor();
        System.out.println("=====================");

        Employee employee1=new Employee("Canan",123,120000);//3
        System.out.println(employee1.name);
        System.out.println(employee1.id);//123
        System.out.println(employee1.salary);//120000

        Employee employee2=new Employee("Rabia",15151,110000);//5
        System.out.println(employee2);
    }
}
class Employee{ //1
    String name;
    long id;
    double salary;
 public Employee(String name,long id, double salary){ //2
     this.name=name;
     this.id=id;
     this.salary=salary;
 }
 public String toString(){//4
     return"Name: "+name+", id: "+id+", salary:"+salary;
 }
}