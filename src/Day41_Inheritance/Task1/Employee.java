package Day41_Inheritance.Task1;
/*creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString

 */
public class Employee {
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;
    public String toString(){
        return "Name: "+name+" JobTitle: "+jobTitle+" Salary: $"+salary+" ID: "+id+" Gender: "+gender;
    }


}
