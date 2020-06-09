package Day41_Inheritance;
// Inheritance--1
/*Inheritance: eassistway to get rich.
     - build relationship een classes
     -super(parent) & sub (child)
    ----------------------------
    sub class:can inherit variable and methods from super class
    super class:cannot inherit anything
    ----------------------------
    Advantage:improves re-usability

    IS A relation:inherited relation between classes
      class Animal{}
      class Dog extends Animal{}
      Dog IS AN Animal
      class Fish extends Animal{}
      Fish IS AN Animal
      Has A relation:
      class Engine{}
      class Car{
      Engine obj=new Engine(); }
      Car Has An Engine



      */
public class Animal {
    /*name   size   weight  */
  public String name;
  public String size;
  public double weight;

   public void eat(){
      System.out.println(name+" is eating");
  }

   public void move(){
        System.out.println(name+" is moving");
    }


}
