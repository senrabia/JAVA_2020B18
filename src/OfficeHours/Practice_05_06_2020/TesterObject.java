package OfficeHours.Practice_05_06_2020;

public class TesterObject {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.name="Rabia";
        tester1.jobTitle="SDET";
        tester1.salary=80000;
        tester1.employeeID=111222333;
        System.out.println(tester1);//This statement to hgether another page==> public String toStirng()
//=============== 1 ==========================
        Tester tester2 = new Tester();
        tester2.name="Irem";
        tester2.jobTitle="IT";
        tester2.salary=100000;
        tester2.employeeID=111000333;
        System.out.println(tester2);
//================ 2 =========================
        Tester tester3 = new Tester();
        tester3.setInfo("Melek","Junior SDET",100000,123456);
        System.out.println(tester3);

tester1.smokeTesting();
tester2.smokeTesting();
tester3.smokeTesting();
tester1.creatingTicket();
tester2.creatingTicket();
tester3.creatingTicket();

    }
}