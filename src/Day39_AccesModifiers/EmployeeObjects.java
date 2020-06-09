package Day39_AccesModifiers;

public class EmployeeObjects {
    public static void main(String[] args) {
    Employee employee1=new Employee("Rabia");
        System.out.println(employee1);
    Employee employee2=new Employee("Ayla","Mechanic");
        System.out.println(employee2);
    Employee employee3=new Employee("Melek","SDET",12345);
        System.out.println(employee3);
    Employee employee4=new Employee("Irem","SDET",24689,12000);
        System.out.println(employee4);
    Employee employee5=new Employee("Irem","SDET",13456,12000,'F');
        System.out.println(employee5);
    }
}
