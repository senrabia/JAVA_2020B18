package OfficeHours.Practice_05_06_2020;
/*create a class called Developers
        Attributes:
        name, employeeId, JobTitle, Salary
        Actions:
        setDeveloperInfo(), coding(), fixingBugs()  */
public class Developer {
    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle, double salay, long employeeID) {
        this.name = name; //user given argument is assingned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salay;
        this.employeeID = employeeID;
    }
    public String toString(){
        return "Employee name: " + name + ", Employee ID: " + employeeID+ ", Job title: " + jobTitle+ ", salary: $"+salary;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixingBug(){
        System.out.println(name+" is crying");
}}