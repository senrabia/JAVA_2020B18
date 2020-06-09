package Day48_Abstraction;

/*06/08/2020
Topic: Interface
       Interface VS Abstract Class
       Recap
       abstraction: hiding the implementation details
                abstract methods
                abstract class
                Interface
day48_Abstraction
Warmup tasks:
    1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting()
            instance method: toString()
    2. create the following subclasses of phone:
                        1. iPhone
                        2. Samsung
            create constructors in each sub class that can initialize the instance variables
abstract class: abstract class is meant to be extedned (final)
abstract method: method without implementation
                 meant to be override (cannot final, static, private)
 creating class:
        public class className{
        }


 */

    /*1. create an abstract class called Phone
                attributes: brand, model, price, size
                abstract methods: calling(), texting()
                instance method: toString()
    */
    public abstract class Phone {
        public static String brand;
        public  String model;
        public double price;
        public String size;

        public abstract void calling(long phoneNumber);

        public abstract void texting(long phoneNumber);

        public String toString(){
            return "Brand : "+ brand + ", Model: "+model+", Price : $"+price + ", Size: "+size;
        }



    }


