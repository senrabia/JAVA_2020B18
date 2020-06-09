package Day46_final_abstract;
import OfficeHours.Practice_05_20_2020.Pet;

public abstract class Path {
    /*
    Task01:
      1. creaet an abstract class called Pets
            attributes: name, age, color, breed, gender
            methods:
               abstract methods: sleep, eat, speak
               instance method: toString
      2. create three sub classes (non-abstract) of pet:
                        1. Dog
                        2. Cat
                        3. Tiger
            each class MUST have constructors to initialize the attributes
     */

    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public String toString(){
        return name+" "+ age+" "+color+" "+breed+" "+gender;

    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas", 5,"white", "now ",'F' );
        dog1.sleep();
        System.out.println(dog1);
    }
}
class Dog extends Path{
    public Dog(String name, int age, String color, String breed, char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }
    public void sleep(){

    }
    public void eat(){

    }
    public void speak(){

    }
}
class Cat extends Path{
    public Cat(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }
        public void sleep(){

        }
        public void eat(){

        }
        public void speak(){

        }
    }

class Tiger extends Path{
    public  Tiger(String name, int age, String color,String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }
    public void sleep(){
    }
    public void eat(){
    }
    public void speak(){
    }
}









