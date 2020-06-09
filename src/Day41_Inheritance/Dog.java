package Day41_Inheritance;
//AnimalClass Inheritance-- 2
public class Dog extends Animal{
    /* public String name;
  public String size;
  public String weight;

  public void eat(){
      System.out.println(name+"is eating");
  }
    public void move(){
        System.out.println(name+"is moving");
     */

    public void bark(){
        System.out.println(name+" is barking");
    }
    public void run(){
        System.out.println("is able to run");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";  // EROR if we dont give the class EXTEND
        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();
       // dog1.swim(); //L.EROR
        dog1.bark();
        dog1.run();
    }
}
