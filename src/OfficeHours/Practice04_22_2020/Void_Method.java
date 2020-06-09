package OfficeHours.Practice04_22_2020;

public class Void_Method {
    /*declare:
     Access-modifier specifier terurn-type methodName(parameter)
        statements;
     */

    public static void main(String[] args) {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("==================");
        print();
        System.out.println("===================");
        boolean USCitizen=true;//IMPORTANT=> ergumet
        int age=21;
        Vote(age, USCitizen);        //IMPORTANT
        Vote(35,false); //IMPORTANT
        System.out.println("===================");
        EligibleToBuyCigaters(17);

    }
    public static void print() {
        System.out.println("Hello Batch 18");//We do have a ***BUG***
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

    }

    //Write a function that can identify if a person eligible to vote
    //MUST konow:age,USCitizen

    public static void Vote(int age, boolean USCitizen) {
        boolean eligibleToVote=age>=18 && USCitizen==true;
        if(eligibleToVote){ System.out.println("You are eligible to vote");}
        else { System.out.println("You are not eligible to vote yet");}
    }

//Write a method if a person is eligible to buy cigarets
//MUST know:age
     public static void EligibleToBuyCigaters(int age) {
        if(age>18) {System.out.println("Eligible to buy");}
        else{ System.out.println("You can buy Milk or candy");}

}}
