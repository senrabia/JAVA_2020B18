package OfficeHours.Practice_05_13_2020;
//--1
/*Instances: belong to the , each object has bit's own copy of instances
* variables
* methods
* block */

public class Instances {
    String name;

    {
        name = "Zura";
    }

    public static void main(String[] args) {
        Instances obj = new Instances();
        obj.name = "Zura";
        System.out.println(obj.name);
    }

    public void printName(){
    System.out.println("Name is: "+this.name);
}}

