package OfficeHours.Practice_05_20_2020;
//15:40
/*05/20/2020
Practice Topic: Inheritance
                Access modifiers & inheritance
                super keyword
package name: Practice_05_20_2020
access modifiers:

        private < default < protected < public
Inheritance: builds relations between classes (easiest way to get rich)

            sub (child) & super (parent) classes
            Class A  extends class B
                 sub         sper class
            Class C extends class B
            sub class: inherits from super class
                    only the VISIBLE variables & methods can be inherited
                    private: NEVER
                    default: can be inherited to sub classes that are in same package
                    protected & public : can ALWAYS be inherited to ANY sub class
                    CONSTRUCTOR WILL NOT BE INERITED
            super class: cannot inherit anything from sub class
            a class can be extedned by multiple classes
            a class can ONLY extend one class
                class A{ // a
                    int a;
                }
                class B extends A{ // a, b
                    int b;
                }
                class C extends B{ // a, b, c
                    int c;
                }
        advantage: re-usable
                    easy to maintain
task:

    custom class: Cat, Dog, Bunny
    Dog:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, bark
    Cat:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, scratch
    Bunny:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, Dig
    custom class: pet
            variables:  name, age, color, size, breed, isPet, numberOfeyes
            methods:    eat, sleep, drink, toString


 */
public class House  {  //HAS Relation HOUSE HAS cAT
    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas",5,"black","large","Husky");
       //dog1.setInfo("Karabas",5,"black","large","Husky");

        Dog dog2=new Dog("Rindik", 5, "White", "Huge","Kangal");
        System.out.println(dog1);
        System.out.println(dog2);

        dog1.bark();
        System.out.println("==========================================");

        Cat cat1= new Cat("Pamuk",1,"White","Large","Van");
       // cat1.setInfo("Pamuk",1,"White","Large","Van");
        System.out.println(cat1);
         cat1.scratch();
        //dog1.scratch();

        Cat cat2= new Cat("Boncuk",2,"White","Large","Van");
        // cat1.setInfo("Pamuk",1,"White","Large","Van");
        System.out.println(cat2);
        //=====================================
        Bunny bunny1=new Bunny("Pamuk",1,"white","small","Holland lop");
        bunny1.setInfo("Pamuk",1,"white","small","Holland lop");
        System.out.println(bunny1);

    }
}
