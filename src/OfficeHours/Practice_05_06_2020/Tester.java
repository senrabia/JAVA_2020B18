package OfficeHours.Practice_05_06_2020;
/*create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
	===============================================
	this:refers to the object instances
	this.:can accces to the object instance
	the only time we used
				*/
public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle,double salay,long employeeID ){
       this.name=name; //user given argument is assingned to instance variable name
       this.jobTitle=jobTitle;
       this.salary=salay;
       this.employeeID=employeeID;
    }
    public String toString(){
        return "Employee name: " + name + ", Employee ID: " + employeeID+ ", Job title: " + jobTitle+ ", salary: $"+salary;
    }
    public void smokeTesting(){
       // int name=100;//local veriable
        System.out.println(this.name+" is doing smoke test");
    }
    public void creatingTicket(){
       // int name=200; //local veriable
        System.out.println(name+" is creating ticket on Jira");


    }



}
