package Day42_Inheritance.Task01;
/*create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString

 */
public class Employee extends Person{
    /* name(inherited)
       age(inherited)
       gender(inherited)
       Salary
       employeeID
        jobTitle

        setPersonInfo()(inherited)
        eat()(inherited)
        sleep()(inherited)
        walk()(inherited)
        drink()(inherited)

        setEmployeeInfo()
        work()
        toString()
     */
    public double salary;
    public long employeeID;
    public String jobTitle;

    public void setEmployeeInfo(String name,int age,char gender,double salary,long employeeID,String jobTitle){
        setPersonInfo(name,age,gender); //BURAYA BAK
        this.employeeID=employeeID;
        this.jobTitle =jobTitle;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }
    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+employeeID+", Salary: "+salary+", age: "+age+", gender: "+gender;
    }
}
