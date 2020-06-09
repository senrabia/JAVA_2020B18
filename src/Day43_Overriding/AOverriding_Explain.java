package Day43_Overriding;

public class AOverriding_Explain {
    /*05/21/2020
Topics: Method Overriding
        Overloading vs Overriding
package name: day43_MethodOverriding
warmup Task:
        1. create a class called Shape
                        vairables: area, perimeter
                        methods: calculateArea(), calculatePerimeter()
        2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC:
        3. override super class' Area(), perimeter() methods to the sub classesFormulas:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side

access modifier:
        public > protected > default > private
method overloading: same method different parameter
                    return-type can be same or different
                    any method can be overloaded
                    access modifier can be same or different
method overriding: same method name, same parameter, same return-type  (MUST)
                   MUST happen in the sub class
                   access modifer MUST be same or more visible
why we need overriding: to implement different functions to the same method
@Override: identifies if the method is overriden method
*/
  /*  //REEM NOTEto override method:
    to override method:
                     * can be done ONLY in SUB class (==> or it will get compile error)
                     * MUST BE SAME method name, SAME parameter, SAME returnType
                     * CAN NOT have private access modifier ( it will not be inherited)
                     * Access modifier MUST be same or more accessible than the original one
                         default ==> protected ==> public
                     * STATIC can NOT be overridden == only ONE copy for all objects
                     * CONSTRUCTORS can NOT be overridden == it can NOT be inherited
                     * Only INSTANCE methods can be overridden
@Override : identifies if method is overridden or not. Must be applicable.
Only ONE method is created in memory (The one created in Super class).
One method with different functions when we override.
    */

}
