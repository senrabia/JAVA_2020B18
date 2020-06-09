package OfficeHours.Package05_27_2020;

public class AOOP_Summary {
}
/*  OOP SUMMARY (ENCAPSULATION & INHERITENCE)

    Overloding:   -same method name, different parameter.(MUST)
                  -return type doesn't matter.
                  -access modifier does not matter
                  - any method can be overloading

    Overriding: -same name & same parameter.
                -access modifiers need to be same or more visible
                - retun type MUST be same.
                -ONLY the instance method (VISIBLE) can be overriden.

    Pre_condition:MUST take place in subclass(child)
    @Override:check if method is being overriden.

    Visibility:    - public > protected > default > private

    Encapsulation: - hiding the data by giving private access modifier.
                   - other sources can only access to it through public getter / setter.
                   -getter(READ ONLY): returns the private data.
                   -setter(WRITE ONLY): assigning the argument to the private data.

    Inheritance:   - building relationships between class.
                   -super & sub relation.
                   -super class: connat inherit anything from sub class.
                   -sub class:  inherits the methods and variables (Visible) from super class.
                   -advantages:resuable
                               readble
                               orginzed
                               easy to memorize
                               easy to main tain.
    TestBase:
             setUp(): login ...
             Test1:
             Test2:
             ......




     why we need overriding:
                    - to implement differnt function/implemntation to the method.

  example 1:
  car:  ==> PARENT CLASS
        start():push button
        ==> CHILD CLASS
  BMW :
        start():push the start button.

  Toyota:
        start():insert key


 example 2:
        shape:
            Area():
        Circle:
            Area(): PI * R
        Triangle:
            Area(): Base*Height * 1/2
        same method name & parameter, but different implementation.


  */

/*  REEM
OverLoading:
    * happens in SAME class
    * SAME method name
    * DIFFERENT parameter
    * Return type does NOT matter
    * Access modifier does NOT matter
    * Instance method CAN be overloaded
    * STATIC methods CAN be overloaded
    * Constructor CAN be overloaded
    * ALL METHODS CAN BE OVERLOADED
 */