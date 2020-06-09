package OfficeHours.Practice_05_20_2020;
//15:00
public class Cat extends Pet {
    /*  variables: name,age,color,size, breed, isPet, numberOfeyes
       methods:eat, sleep, drink,toString
    ---------------------------------------
    not inherited:
       scratch
   */

 public Cat(String name, int age, String color, String size, String breed ){
 setInfo(name, age, color ,size, breed);}

 public void scratch(){
     System.out.println(name+" is scratching");

 }
  /*public Cat(){
     this("A", 1, "A","B","M");
}*/

}
